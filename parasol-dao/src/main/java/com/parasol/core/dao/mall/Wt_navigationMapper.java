package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_navigation;

import java.util.List;

public interface Wt_navigationMapper {

    int deleteByPrimaryKey(Integer naId);

    int insert(Wt_navigation record);

    int insertSelective(Wt_navigation record);

    Wt_navigation selectByPrimaryKey(Integer naId);

    int updateByPrimaryKeySelective(Wt_navigation record);

    int updateByPrimaryKey(Wt_navigation record);

    List<Wt_navigation> selectByAd(Integer adExId);
}