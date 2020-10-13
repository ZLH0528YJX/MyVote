package com.cssl.service;

import com.cssl.entity.VoteUser;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.service
 * @Author: yjx
 * @CreateTime: 2020-09-27 :29
 * @Description: 用户业务逻辑接口
 */


public interface VoteUserService {
    //登录
    VoteUser login(VoteUser user);
    //注册
    Integer regist(VoteUser user);
    //重名检查
    Integer checkReName(String name);
}
