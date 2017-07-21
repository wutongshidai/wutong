package com.parasol.core.dao.experts;

import com.parasol.core.experts.Experts;
import com.parasol.core.experts.ExpertsB;
import com.parasol.core.experts.ExpertsQuery;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ExpertsMapper {
    int countByExample(ExpertsQuery example);

    int deleteByExample(ExpertsQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Experts record);

    int insertSelective(Experts record);

    List<Experts> selectByExample(@Param("example")ExpertsQuery example,@Param("maps")Map<String, Integer> map);

    ExpertsB selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Experts record, @Param("example") ExpertsMapper example);

    int updateByExample(@Param("record") Experts record, @Param("example") ExpertsMapper example);

    int updateByPrimaryKeySelective(Experts record);

    int updateByPrimaryKey(Experts record);
    
    
    Experts selectByUserId(Integer userId);
}