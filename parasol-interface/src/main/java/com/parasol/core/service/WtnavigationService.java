package com.parasol.core.service;

import java.util.List;

import com.parasol.core.mall.Wt_navigation;

public interface WtnavigationService {

	Integer deleteByPrimaryKey(Integer naId);

    Integer insert(Wt_navigation record);

    Integer insertSelective(Wt_navigation record);

    Wt_navigation selectByPrimaryKey(Integer naId);

    Integer updateByPrimaryKeySelective(Wt_navigation record);

    Integer updateByPrimaryKey(Wt_navigation record);
    
//    Wt_navigation selectByAd(Integer adExId);
    
    List<Wt_navigation> selectByAd(Integer adExId);
}
