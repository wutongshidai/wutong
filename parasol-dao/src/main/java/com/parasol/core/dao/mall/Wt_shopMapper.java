package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_shop;

public interface Wt_shopMapper {

    int deleteByPrimaryKey(Integer spId);

    int insert(Wt_shop record);

    int insertSelective(Wt_shop record);

    Wt_shop selectByPrimaryKey(Integer spId);

    int updateByPrimaryKeySelective(Wt_shop record);

    int updateByPrimaryKey(Wt_shop record);
}