package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_admin;

public interface Wt_adminMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Wt_admin record);

    int insertSelective(Wt_admin record);

    Wt_admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wt_admin record);

    int updateByPrimaryKey(Wt_admin record);
}