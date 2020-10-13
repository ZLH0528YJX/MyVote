package com.cssl.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.entity
 * @Author: yjx
 * @CreateTime: 2020-09-28 :17
 * @Description: 投票表类
 */


public class VoteItem implements Serializable {

    private Integer viId;
    private Integer vuUserId;
    private Integer vsId;
    private Integer voId;

    public Integer getViId() {
        return viId;
    }

    public void setViId(Integer viId) {
        this.viId = viId;
    }

    public Integer getVuUserId() {
        return vuUserId;
    }

    public void setVuUserId(Integer vuUserId) {
        this.vuUserId = vuUserId;
    }

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public VoteItem(Integer viId, Integer vuUserId, Integer vsId, Integer voId) {
        this.viId = viId;
        this.vuUserId = vuUserId;
        this.vsId = vsId;
        this.voId = voId;
    }

    public VoteItem() {
    }
}
