package com.cssl.entity;

import java.io.Serializable;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.entity
 * @Author: yjx
 * @CreateTime: 2020-09-28 :50
 * @Description: 主题类
 */


public class VoteSubject implements Serializable {
    private Integer vsId;
    private String vsTitle;
    private Integer vsType;

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public String getVsTitle() {
        return vsTitle;
    }

    public void setVsTitle(String vsTitle) {
        this.vsTitle = vsTitle;
    }

    public Integer getVsType() {
        return vsType;
    }

    public void setVsType(Integer vsType) {
        this.vsType = vsType;
    }

}
