package com.cssl.service.impl;

import com.cssl.entity.VoteUser;
import com.cssl.mapper.VoteUserMapper;
import com.cssl.service.VoteUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.service.impl
 * @Author: yjx
 * @CreateTime: 2020-09-27 :29
 * @Description: 用户业务逻辑实现类
 */

@Service
public class VoteUserServiceImpl implements VoteUserService {
    @Resource
    VoteUserMapper voteUserMapper;
    //登录
    @Override
    public VoteUser login(VoteUser user) {
        return voteUserMapper.login(user);
    }

    //注册
    @Override
    public Integer regist(VoteUser user) {
        return voteUserMapper.regist(user);
    }

    //重名检查
    @Override
    public Integer checkReName(String name) {
        return voteUserMapper.checkReName(name);
    }
}
