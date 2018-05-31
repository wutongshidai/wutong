package com.parasol.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.parasol.core.adPositionId.AdPositionId;
import com.parasol.core.adPositionId.IndexImgCategory;
import com.parasol.core.dao.adpositionid.IndexImgCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("indexImgCategoryServiceImpl")
public class IndexImgCategoryServiceImpl implements IndexImgCategoryService {

    @Autowired
    IndexImgCategoryMapper indexImgCategoryMapper;

    @Override
    public int updateByExample(IndexImgCategory record) {
        int i = indexImgCategoryMapper.updateByExample(record);
        System.out.println("更新行数：" + i + ":::" +  record);
        return i;
    }

    @Override
    public int deleteId(Integer id) {
        int i = indexImgCategoryMapper.deleteId(id);
        System.out.println("删除行数：" + i);
        return i;
    }

    @Override
    public int addAd(IndexImgCategory record) {
        int i = indexImgCategoryMapper.addAd(record);
        System.out.println("添加行数：" + i + ":::" +  record);
        return i;
    }

    @Override
    public PageInfo<IndexImgCategory> list(Integer id, Integer gdId, Integer pageNo, Integer pageSize) {
        pageNo = (pageNo == null || pageNo == 0 ? 1 : pageNo);
        PageHelper.startPage(pageNo, pageSize);
        List<IndexImgCategory> indexImgCategories = indexImgCategoryMapper.list(id,gdId);
        PageInfo<IndexImgCategory> pageInfo = new PageInfo<>(indexImgCategories);
        return pageInfo;
    }
}
