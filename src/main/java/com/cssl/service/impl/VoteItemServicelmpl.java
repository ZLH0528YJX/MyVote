package com.cssl.service.impl;

import com.cssl.mapper.VoteItemMapper;
import com.cssl.service.VoteItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.service.impl
 * @Author: yjx
 * @CreateTime: 2020-10-09 :12
 * @Description:
 */

@Service
public class VoteItemServicelmpl implements VoteItemService {

    @Resource
    VoteItemMapper voteItemMapper;
    //新增投票记录
    @Override
    public Integer addItem(Integer uid, Integer oid, Integer sid) {
        return voteItemMapper.addItem(uid, oid, sid);
    }
}
