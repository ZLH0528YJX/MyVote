package com.cssl.entity;

import java.io.Serializable;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.entity
 * @Author: yjx
 * @CreateTime: 2020-09-27 :59
 * @Description: 用户类
 */


public class VoteUser implements Serializable {
    private Integer vuUserId;
    private String  vuUserName;
    private String vuPassword;
    private Integer vuStatus;

    public Integer getVuUserId() {
        return vuUserId;
    }

    public void setVuUserId(Integer vuUserId) {
        this.vuUserId = vuUserId;
    }

    public String getVuUserName() {
        return vuUserName;
    }

    public void setVuUserName(String vuUserName) {
        this.vuUserName = vuUserName;
    }

    public String getVuPassword() {
        return vuPassword;
    }

    public void setVuPassword(String vuPassword) {
        this.vuPassword = vuPassword;
    }

    public Integer getVuStatus() {
        return vuStatus;
    }

    public void setVuStatus(Integer vuStatus) {
        this.vuStatus = vuStatus;
    }

    public VoteUser(Integer vuUserId, String vuUserName, String vuPassword, Integer vuStatus) {
        this.vuUserId = vuUserId;
        this.vuUserName = vuUserName;
        this.vuPassword = vuPassword;
        this.vuStatus = vuStatus;
    }

    public VoteUser() {
    }

    @Override
    public String toString() {
        return "VoteUser{" +
                "vuUserId=" + vuUserId +
                ", vuUserName='" + vuUserName + '\'' +
                ", vuPassword='" + vuPassword + '\'' +
                ", vuStatus=" + vuStatus +
                '}';
    }
}
