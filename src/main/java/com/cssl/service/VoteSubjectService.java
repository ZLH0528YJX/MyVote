package com.cssl.service;

import com.cssl.vo.VoteView;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.service
 * @Author: yjx
 * @CreateTime: 2020-09-28 :18
 * @Description: 主题类业务逻辑接口
 */


public interface VoteSubjectService {
    //分页查询投票集合
    PageInfo pagefingAll(Integer page);
    //根据id查询投票详情
    VoteView findViewBySid(Integer sid);
}
