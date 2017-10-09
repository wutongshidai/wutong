package com.parasol.core.dao.mall;

import java.util.List;

import com.parasol.core.mall.Wt_admin_expend;

public interface Wt_admin_expendMapper {

    int deleteByPrimaryKey(Integer adExId);

    int insert(Wt_admin_expend record);

    int insertSelective(Wt_admin_expend record);

    Wt_admin_expend selectByPrimaryKey(Integer adExId);

    int updateByPrimaryKeySelective(Wt_admin_expend record);

    int updateByPrimaryKey(Wt_admin_expend record);
    
    List<Wt_admin_expend> selectByName(String adShopName);
    
    Wt_admin_expend selectByadId(Integer id);

    int updateByadId(Wt_admin_expend wt_admin_expend);
}