package com.cssl.vo;

import com.cssl.entity.VoteOption;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.entity
 * @Author: yjx
 * @CreateTime: 2020-09-28 :58
 * @Description: 投票查询传输类
 */


public class VoteView implements Serializable {
    //选项集合
    private List<VoteOption> optionList;
    //主题属性
    private Map<String,Object> subList;

    public List<VoteOption> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<VoteOption> optionList) {
        this.optionList = optionList;
    }

    public Map<String, Object> getSubList() {
        return subList;
    }

    public void setSubList(Map<String, Object> subList) {
        this.subList = subList;
    }

    @Override
    public String toString() {
        return "VoteView{" +
                "optionList=" + optionList +
                ", subList=" + subList +
                '}';
    }
}
