package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_favourite;

public interface Wt_favouriteMapper {

    int deleteByPrimaryKey(Integer faId);

    int insert(Wt_favourite record);

    int insertSelective(Wt_favourite record);

    Wt_favourite selectByPrimaryKey(Integer faId);
    
    int updateByPrimaryKeySelective(Wt_favourite record);

    int updateByPrimaryKey(Wt_favourite record);
}