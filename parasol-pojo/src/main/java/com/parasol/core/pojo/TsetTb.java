package com.parasol.core.pojo;

import java.io.Serializable;

public class TsetTb implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "TsetTb [id=" + id + ", cheshi=" + cheshi + ", adfp=" + adfp + ", money=" + money + "]";
	}
	public TsetTb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	private Integer id;
	private String cheshi;
	private String adfp;
	private Double money;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCheshi() {
		return cheshi;
	}
	public void setCheshi(String cheshi) {
		this.cheshi = cheshi;
	}
	public String getAdfp() {
		return adfp;
	}
	public void setAdfp(String adfp) {
		this.adfp = adfp;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	
}
