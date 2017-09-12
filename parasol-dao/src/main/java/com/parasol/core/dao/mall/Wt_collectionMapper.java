package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_collection;

public interface Wt_collectionMapper {
    int deleteByPrimaryKey(Integer coId);

    int insert(Wt_collection record);

    int insertSelective(Wt_collection record);
    
    Wt_collection selectByPrimaryKey(Integer coId);
    
    int updateByPrimaryKeySelective(Wt_collection record);

    int updateByPrimaryKey(Wt_collection record);
}