package com.parasol.core.service;

import java.util.List;

import com.parasol.core.mall.Wt_favourite;

public interface WtfavouriteService {

	Integer deleteByPrimaryKey(Integer faId);

    Integer insert(Wt_favourite record);

    Integer insertSelective(Wt_favourite record);

    Wt_favourite selectByPrimaryKey(Integer faId);
    
    Integer updateByPrimaryKeySelective(Wt_favourite record);

    Integer updateByPrimaryKey(Wt_favourite record);
    
    List<Wt_favourite> selectByUserId(Integer userId);
    
    Integer insertFavourite(Integer userId , Integer gd_id );
    
    Integer deleteByUserId(Integer userId);
    
    Integer deleteByGdId(Integer gdId , Integer userId);
}
