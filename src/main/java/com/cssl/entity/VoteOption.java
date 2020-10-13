package com.cssl.entity;

import java.io.Serializable;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.entity
 * @Author: yjx
 * @CreateTime: 2020-09-28 :21
 * @Description: 选项实体类
 */


public class VoteOption implements Serializable {

    private Integer voId;
    private Integer vsId;
    private String voOption;
    private Integer voOrder;
    private Integer count;
    private String percentage;

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public String getVoOption() {
        return voOption;
    }

    public void setVoOption(String voOption) {
        this.voOption = voOption;
    }

    public Integer getVoOrder() {
        return voOrder;
    }

    public void setVoOrder(Integer voOrder) {
        this.voOrder = voOrder;
    }

    public VoteOption(Integer voId, Integer vsId, String voOption, Integer voOrder) {
        this.voId = voId;
        this.vsId = vsId;
        this.voOption = voOption;
        this.voOrder = voOrder;
    }

    public VoteOption() {
    }

    @Override
    public String toString() {
        return "VoteOption{" +
                "voId=" + voId +
                ", vsId=" + vsId +
                ", voOption='" + voOption + '\'' +
                ", voOrder=" + voOrder +
                ", count=" + count +
                ", percentage='" + percentage + '\'' +
                '}';
    }
}
