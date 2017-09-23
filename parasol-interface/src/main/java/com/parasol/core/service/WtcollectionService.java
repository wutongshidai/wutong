package com.parasol.core.service;

import java.util.List;

import com.parasol.core.mall.Wt_collection;

public interface WtcollectionService {

	Integer deleteByPrimaryKey(Integer coId);

    Integer insert(Wt_collection record);

    Integer insertSelective(Wt_collection record);
    
    Wt_collection selectByPrimaryKey(Integer coId);
    
    Integer updateByPrimaryKeySelective(Wt_collection record);

    Integer updateByPrimaryKey(Wt_collection record);
    
    List<Wt_collection> selectByUserId(Integer userId);
    
    Integer deleteByUserId(Integer userId);
    
    Integer insertCollection(Integer userId , Integer adExId );

    Integer delectByAdExId(Integer adExId ,Integer userId) ;
}
