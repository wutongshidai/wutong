package com.parasol.core.controller;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.parasol.core.mall.Wt_admin;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parasol.core.mall.Wt_brand;
import com.parasol.core.mall.Wt_goods;
import com.parasol.core.service.WtgoodsService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author aliang
 * @since 2017/8/28
 */
@Controller
public class WtgoodsController {

    @Autowired
    private WtgoodsService wtgoodsService;
//	@Autowired
//	private WtbrandService wtbrandService;

    @ResponseBody
    @RequestMapping("/deleteGoods.do")
    public int deleteByPrimaryKey(Integer gdId) {
        int i = wtgoodsService.deleteByPrimaryKey(gdId);
        return i;
    }

    /**
     * @param map
     * @return 0 失败；1成功
     */
    @ResponseBody
    @RequestMapping("/insertGoods.do")
    public int insert(@RequestBody Map map) {
        Wt_goods record = new Wt_goods();
        try {
            BeanUtils.populate(record, map);
            record.setGdTime(new Date());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return 0;
        }
        int i = wtgoodsService.insert(record);
        return i;
    }

    /*
     * 商品录入
     */
    @ResponseBody
    @RequestMapping(value = "/insertSelectiveGoods.do", method = {RequestMethod.POST, RequestMethod.GET})
    public int insertSelective(@RequestBody Map map) {
        System.out.println(map);
        Wt_goods goods = new Wt_goods();
        try {
            BeanUtils.populate(goods, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(goods);
//		Map<String, String[]> parameterMap = record.getParameterMap();
//		System.out.println(parameterMap);
//		String gdOrder = record.getParameter("gdOrder");
        System.out.println(map.toString());
        int i = wtgoodsService.insertSelective(goods);
        return i;
    }

    /*
     * 商品详情
     */
    @ResponseBody
    @RequestMapping("/goodsDetail.do")
    public Map<String, Object> goodsDetail(Integer gdId) {
        Map<String, Object> map = new HashMap<>();
        Wt_goods goods = wtgoodsService.selectByPrimaryKey(gdId);
//		Wt_brand brand = wtbrandService.selectByPrimaryKey(goods.getBrandId());
        map.put("goods", goods);
//		map.put("brand", brand);
        return map;
    }

    /*
     * 商品管理回显
     */
    @ResponseBody
    @RequestMapping("/goodsDisplay.do")
    public Map<String, Object> goodsDisplay(Integer gdId) {
        Map<String, Object> map = new HashMap<>();
        Wt_goods goods = wtgoodsService.selectByPrimaryKey(gdId);
        map.put("goods", goods);
        return map;
    }

    /*
     *修改上下架状态
     */
    @ResponseBody
    @RequestMapping("/goodsGrounding .do")
    public String goodsGrounding(Integer gdId, String gdDisplay) {
        Wt_goods wt_goods = wtgoodsService.selectByPrimaryKey(gdId);
        wt_goods.setGdDisplay(gdDisplay);
        int i = wtgoodsService.updateByPrimaryKeySelective(wt_goods);
        if (i == 1) {
            return "success";
        }
        return "fail";
    }

	/*  
	 * 商品编辑............
	 */
/*	@ResponseBody
	@RequestMapping("/updateSelectiveGoods.do")
	public int updateKeySelective(Wt_goods record) {
		int i = wtgoodsService.updateByPrimaryKeySelective(record);
		return i;
	}*/

    /*
     * 商品查询
     */
    @ResponseBody
    @RequestMapping("/updateSelectiveGoods.do")
    public int updateByPrimaryKeySelective(Wt_goods record) {
        int i = wtgoodsService.updateByPrimaryKeySelective(record);
        return i;
    }

    @ResponseBody
    @RequestMapping("/updateGoods.do")
    public int updateByPrimaryKey(Wt_goods record) {
        int i = wtgoodsService.updateByPrimaryKey(record);
        return i;
    }
}
