package com.parasol.core.service;

import com.parasol.core.dao.mall.Wt_admin_expendMapper;
import com.parasol.core.mall.Wt_admin_expend;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.parasol.core.dao.mall.Wt_adminMapper;
import com.parasol.core.mall.Wt_admin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service("wtadminService")
@Transactional
public class WtadminServiceImpl implements WtadminService {

    @Autowired
    private Wt_adminMapper wt_adminMapper;

    @Autowired
    private Wt_admin_expendMapper wt_admin_expendMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = wt_adminMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Map insert(Wt_admin record) {
        Map map = new HashMap();
        wt_adminMapper.insert(record);
        System.out.println(record.toString());
        if (record.getId() != null) {
            Wt_admin_expend wt_admin_expend = new Wt_admin_expend();
            wt_admin_expend.setAdId(record.getId());
            //获取到插入后的商家表ID插入拓展表中
            int b = wt_admin_expendMapper.insert(wt_admin_expend);
            if (b != 0) {
                System.out.println("注册成功");
                map.put("adId", record.getId());
                return map;
            } else {
                System.out.println("插入拓展表失败");
                return map;
            }
        } else {
            System.out.println("插入商家表失败");
            return map;
        }
    }

    @Override
    public int insertSelective(Wt_admin record) {
        int i = wt_adminMapper.insertSelective(record);
        return i;
    }

    @Override
    public Wt_admin selectByPrimaryKey(Integer id) {
        Wt_admin key = wt_adminMapper.selectByPrimaryKey(id);
        return key;
    }

    @Override
    public int updateByPrimaryKeySelective(Wt_admin record) {
        int i = wt_adminMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Wt_admin record) {
        int i = wt_adminMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public Boolean selectByUserName(String userName) {
        Wt_admin admin = wt_adminMapper.selectByUserName(userName);
        if (admin != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Boolean selectByPhone(String phone) {
        Wt_admin admin = wt_adminMapper.selectByPhone(phone);
        if (admin != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Map<String, Object> login(Wt_admin admin) {
        admin = wt_adminMapper.login(admin);
        if (admin != null) {
            System.out.println(admin.toString());
            Wt_admin_expend wt_admin_expend = wt_admin_expendMapper.selectByadId(admin.getId());
//            JSONObject jsonObject = new JSONObject();
            JSONObject jsonObject = JSONObject.fromObject(wt_admin_expend);
//            BeanMap beanMap = new BeanMap(wt_admin_expend);
//
//            System.out.println(beanMap);
//            beanMap.setBean(admin);
            jsonObject.put("userName", admin.getUserName());
            jsonObject.put("companyName", admin.getCompanyName());
            jsonObject.put("adId", admin.getId());
            jsonObject.put("mobilePhone", admin.getMobilePhone());
            return jsonObject;
        } else {
            return null;
        }
    }

    @Override
    public Map<String, Object> selectInfo(Integer adExId) {
        Wt_admin_expend wt_admin_expend = wt_admin_expendMapper.selectByPrimaryKey(adExId);
        Integer adId = wt_admin_expend.getAdId();
        Wt_admin admin = wt_adminMapper.selectByPrimaryKey(adId);
        JSONObject jsonObject = JSONObject.fromObject(wt_admin_expend);
        jsonObject.put("userName", admin.getUserName());
        jsonObject.put("companyName", admin.getCompanyName());
        jsonObject.put("adId", admin.getId());
        jsonObject.put("mobilePhone", admin.getMobilePhone());
        return jsonObject;
    }

}
