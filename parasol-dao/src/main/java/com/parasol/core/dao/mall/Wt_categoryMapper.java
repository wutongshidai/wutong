package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_category;

public interface Wt_categoryMapper {

    int deleteByPrimaryKey(Integer catId);

    int insert(Wt_category record);

    int insertSelective(Wt_category record);

    Wt_category selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(Wt_category record);

    int updateByPrimaryKey(Wt_category record);
}