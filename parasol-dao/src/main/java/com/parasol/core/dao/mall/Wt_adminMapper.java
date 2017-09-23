package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_admin;

public interface Wt_adminMapper {

    int deleteByPrimaryKey(Integer id);

    void insert(Wt_admin record);

    int insertSelective(Wt_admin record);

    Wt_admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wt_admin record);

    int updateByPrimaryKey(Wt_admin record);

    Wt_admin selectByUserName(String userName);

    Wt_admin selectByPhone(String phone);

    Wt_admin login(Wt_admin admin);
}