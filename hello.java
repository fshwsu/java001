package com.fsh.pojo;
//=====================================


/**
 *---------------------------------------
 *
 */
import java.util.Date;

public class Goods {
	 
	private int id;
	private String name;
	private float minprice;
	private float avgprice;
	private float maxprice;
	private String standard;
	private String unit;
	private Date createdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMinprice() {
		return minprice;
	}
	public void setMinprice(float minprice) {
		this.minprice = minprice;
	}
	public float getAvgprice() {
		return avgprice;
	}
	public void setAvgprice(float avgprice) {
		this.avgprice = avgprice;
	}
	public float getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(float maxprice) {
		this.maxprice = maxprice;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

}
