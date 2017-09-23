package com.parasol.core.dao.mall;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.mall.Wt_favourite;

public interface Wt_favouriteMapper {

    int deleteByPrimaryKey(Integer faId);

    int insert(Wt_favourite record);

    int insertSelective(Wt_favourite record);

    Wt_favourite selectByPrimaryKey(Integer faId);
    
    int updateByPrimaryKeySelective(Wt_favourite record);

    int updateByPrimaryKey(Wt_favourite record);
    
    List<Wt_favourite> selectByUserId(Integer userId);
    
    int deleteByUserId(Integer userId);
    
    int deleteByGdId(@Param("gdId")Integer gdId ,@Param("userId")Integer userId);
    
    
}