package com.cssl.mapper;

import com.cssl.entity.VoteItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.mapper
 * @Author: yjx
 * @CreateTime: 2020-09-28 :24
 * @Description: 投票数据访问接口
 */

@Mapper
public interface VoteItemMapper {
    //根据主题id查询投票
    List<VoteItem> findItemBySid(Integer sid);

    //新增投票记录
    Integer addItem(Integer uid,Integer oid,Integer sid);
}
