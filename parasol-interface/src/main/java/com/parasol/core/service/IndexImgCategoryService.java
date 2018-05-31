package com.parasol.core.service;

import com.github.pagehelper.PageInfo;
import com.parasol.core.adPositionId.AdPositionId;
import com.parasol.core.adPositionId.IndexImgCategory;

import java.util.List;
import java.util.Map;

public interface IndexImgCategoryService {

    int updateByExample(IndexImgCategory record);

    int deleteId(Integer id);

    int addAd(IndexImgCategory record);

    PageInfo<IndexImgCategory>list(Integer id, Integer gdId, Integer pageNo, Integer pageSize);

}
