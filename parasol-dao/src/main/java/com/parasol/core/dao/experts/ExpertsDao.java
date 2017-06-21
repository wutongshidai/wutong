package com.parasol.core.dao.experts;

import com.parasol.core.experts.Experts;
import com.parasol.core.experts.ExpertsMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpertsDao {
    int countByExample(ExpertsMapper example);

    int deleteByExample(ExpertsMapper example);

    int deleteByPrimaryKey(Integer id);

    int insert(Experts record);

    int insertSelective(Experts record);

    List<Experts> selectByExample(ExpertsMapper example);

    Experts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Experts record, @Param("example") ExpertsMapper example);

    int updateByExample(@Param("record") Experts record, @Param("example") ExpertsMapper example);

    int updateByPrimaryKeySelective(Experts record);

    int updateByPrimaryKey(Experts record);
}