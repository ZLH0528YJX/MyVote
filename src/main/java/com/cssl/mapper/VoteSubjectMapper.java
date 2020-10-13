package com.cssl.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.mapper
 * @Author: yjx
 * @CreateTime: 2020-09-28 :13
 * @Description: 主题类数据访问接口
 */

@Mapper
public interface VoteSubjectMapper {
    //查询投票主题集合
    List<Map<String,Object>> findSubject ();
    //根据id查询投票主题集合
    Map<String,Object> findSubjectBySid (Integer sid);
}
