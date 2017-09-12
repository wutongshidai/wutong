package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_admin_expend;

public interface Wt_admin_expendMapper {

    int deleteByPrimaryKey(Integer adExId);

    int insert(Wt_admin_expend record);

    int insertSelective(Wt_admin_expend record);

    Wt_admin_expend selectByPrimaryKey(Integer adExId);

    int updateByPrimaryKeySelective(Wt_admin_expend record);

    int updateByPrimaryKey(Wt_admin_expend record);
}