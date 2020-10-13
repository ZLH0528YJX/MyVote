package com.cssl.service.impl;

import com.cssl.entity.VoteItem;
import com.cssl.entity.VoteOption;
import com.cssl.mapper.VoteItemMapper;
import com.cssl.mapper.VoteOptionMapper;
import com.cssl.mapper.VoteSubjectMapper;
import com.cssl.service.VoteSubjectService;
import com.cssl.vo.VoteView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.service.impl
 * @Author: yjx
 * @CreateTime: 2020-09-28 :25
 * @Description: 主题类业务逻辑实现层
 */

@Service
public class VoteSubjectServiceImpl implements VoteSubjectService {

    @Resource
    VoteSubjectMapper subjectMapper;
    @Resource
    VoteOptionMapper optionMapper;
    @Resource
    VoteItemMapper itemMapper;

    //分页查询投票集合
    @Override
    public PageInfo pagefingAll(Integer page) {
        PageHelper.startPage(page,4);
        List<Map<String, Object>> subject = subjectMapper.findSubject();
        PageInfo pageInfo=new PageInfo<>(subject);
        return pageInfo;
    }

    //根据id查询投票详情
    @Override
    public VoteView findViewBySid(Integer sid) {
        Map<String, Object> subjectBySid = subjectMapper.findSubjectBySid(sid);
        Long num1= (Long) subjectBySid.get("number");
        int num =num1.intValue();
        List<VoteOption> optionBySid = optionMapper.findOptionBySid(sid);
        List<VoteItem> itemBySid = itemMapper.findItemBySid(sid);
        VoteView voteView =new VoteView();
        //主题信息
        voteView.setSubList(subjectBySid);
        for(VoteOption option:optionBySid){
            for (VoteItem item:itemBySid){
                if (item.getVoId()==option.getVoId()){
                    if(option.getCount()==null){
                        option.setCount(1);
                    }else{
                        option.setCount(option.getCount()+1);
                    }
                    //计算百分比
                    NumberFormat numberFormat = NumberFormat.getInstance();
                    numberFormat.setMaximumFractionDigits(2);
                    String result = numberFormat.format((float) option.getCount() / (float) num * 100);
                    option.setPercentage(result+"%");
                }
            }
            if (option.getCount()==null){
                option.setCount(0);
                option.setPercentage("0.0%");
            }
        }
        //选项集合
        voteView.setOptionList(optionBySid);
        return voteView;
    }
}
