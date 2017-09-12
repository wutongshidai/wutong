package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_brand;

public interface Wt_brandMapper {

    int deleteByPrimaryKey(Integer brId);

    int insert(Wt_brand record);

    int insertSelective(Wt_brand record);

    Wt_brand selectByPrimaryKey(Integer brId);

    int updateByPrimaryKeySelective(Wt_brand record);

    int updateByPrimaryKey(Wt_brand record);
}