package com.cssl.mapper;

import com.cssl.entity.VoteOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.mapper
 * @Author: yjx
 * @CreateTime: 2020-09-28 :04
 * @Description: 选项数据查询接口
 */

@Mapper
public interface VoteOptionMapper {
    //获取该投票的选项项集合
    List<VoteOption> findOptionBySid(Integer sid);
}
