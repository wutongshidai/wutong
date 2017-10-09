package com.parasol.core.dao.mall;

import java.util.List;

import com.parasol.core.mall.Wt_navigation;

public interface Wt_navigationMapper {

    int deleteByPrimaryKey(Integer naId);

    int insert(Wt_navigation record);

    int insertSelective(Wt_navigation record);

    Wt_navigation selectByPrimaryKey(Integer naId);

    int updateByPrimaryKeySelective(Wt_navigation record);

    int updateByPrimaryKey(Wt_navigation record);
    
//    Wt_navigation selectByAd(Integer adExId);
    List<Wt_navigation> selectByAd(Integer adExId);
}