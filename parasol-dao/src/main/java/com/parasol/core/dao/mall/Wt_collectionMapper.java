package com.parasol.core.dao.mall;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.mall.Wt_collection;

public interface Wt_collectionMapper {
    int deleteByPrimaryKey(Integer coId);

    int insert(Wt_collection record);

    int insertSelective(Wt_collection record);
    
    Wt_collection selectByPrimaryKey(Integer coId);
    
    int updateByPrimaryKeySelective(Wt_collection record);

    int updateByPrimaryKey(Wt_collection record);
    
    List<Wt_collection> selectByUserId(Integer userId);
    
    int deleteByUserId(Integer userId);
    
    Wt_collection selectByAdExId(Integer adExId);
    
    int delectByAdExId(@Param("adExId")Integer adExId ,@Param("userId")Integer userId);
 
}