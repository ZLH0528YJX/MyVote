package com.cssl.mapper;

import com.cssl.entity.VoteUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.mapper
 * @Author: yjx
 * @CreateTime: 2020-09-27 :04
 * @Description: 用户数据访问接口
 */
@Mapper
public interface VoteUserMapper {
    //登录
    VoteUser login(VoteUser user);
    //注册
    Integer regist(VoteUser user);
    //重名检查
    Integer checkReName(String name);
}
