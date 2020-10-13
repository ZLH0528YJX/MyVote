package com.cssl.service;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.service
 * @Author: yjx
 * @CreateTime: 2020-10-09 :12
 * @Description:
 */


public interface VoteItemService {
    //新增投票记录
    Integer addItem(Integer uid,Integer oid,Integer sid);
}
