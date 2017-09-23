package com.parasol.core.mall;

import java.io.Serializable;
import java.util.List;

public class ShopIndexGood implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 商品List
     */
    private List<Wt_goods> children;
    /**
     * 一级分类
     */
    private Integer valve;
    /**
     * 分类
     */
    private String goods;
	public List<Wt_goods> getChildren() {
		return children;
	}
	public void setChildren(List<Wt_goods> children) {
		this.children = children;
	}
	public Integer getValve() {
		return valve;
	}
	public void setValve(Integer valve) {
		this.valve = valve;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ShopIndexGood [children=" + children + ", valve=" + valve + ", goods=" + goods + "]";
	}

    
    
}
