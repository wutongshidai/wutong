package com.parasol.core.dao.adpositionid;

import com.parasol.core.adPositionId.AdPositionId;
import com.parasol.core.adPositionId.IndexImgCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexImgCategoryMapper {


     int updateByExample(IndexImgCategory record);

     int deleteId(Integer id);

     int addAd(IndexImgCategory record);

     List<IndexImgCategory> list(@Param("id") Integer id ,@Param("gdId")Integer gdId);

}
