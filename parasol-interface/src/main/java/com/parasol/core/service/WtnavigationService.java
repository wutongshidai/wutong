package com.parasol.core.service;

import com.parasol.core.mall.Wt_navigation;

import java.util.List;

public interface WtnavigationService {

	Integer deleteByPrimaryKey(Integer naId);

    Integer insert(Wt_navigation record);

    Integer insertSelective(Wt_navigation record);

    Wt_navigation selectByPrimaryKey(Integer naId);

    Integer updateByPrimaryKeySelective(Wt_navigation record);

    Integer updateByPrimaryKey(Wt_navigation record);
    
    List<Wt_navigation> selectByAd(Integer adExId);
}
