package com.project.REST.consulting.DTO;

public class Tel_H_Product_DTO {
	private int tel_code;
	private int  h_pro_code;
	private String h_pro_name;
	private int h_pro_price;
	private String h_pro_info1;
	private String h_pro_infor2;
	private String h_pro_infor3;
	private String h_pro_modify;
	
	public int getTel_code() {
		return tel_code;
	}
	public void setTel_code(int tel_code) {
		this.tel_code = tel_code;
	}
	public int getH_pro_code() {
		return h_pro_code;
	}
	public void setH_pro_code(int h_pro_code) {
		this.h_pro_code = h_pro_code;
	}
	public String getH_pro_name() {
		return h_pro_name;
	}
	public void setH_pro_name(String h_pro_name) {
		this.h_pro_name = h_pro_name;
	}
	public int getH_pro_price() {
		return h_pro_price;
	}
	public void setH_pro_price(int h_pro_price) {
		this.h_pro_price = h_pro_price;
	}
	public String getH_pro_info1() {
		return h_pro_info1;
	}
	public void setH_pro_info1(String h_pro_info1) {
		this.h_pro_info1 = h_pro_info1;
	}
	public String getH_pro_infor2() {
		return h_pro_infor2;
	}
	public void setH_pro_infor2(String h_pro_infor2) {
		this.h_pro_infor2 = h_pro_infor2;
	}
	public String getH_pro_infor3() {
		return h_pro_infor3;
	}
	public void setH_pro_infor3(String h_pro_infor3) {
		this.h_pro_infor3 = h_pro_infor3;
	}
	public String getH_pro_modify() {
		return h_pro_modify;
	}
	public void setH_pro_modify(String h_pro_modify) {
		this.h_pro_modify = h_pro_modify;
	}
	@Override
	public String toString() {
		return "Tel_H_Product_DTO [tel_code=" + tel_code + ", h_pro_code=" + h_pro_code + ", h_pro_name=" + h_pro_name
				+ ", h_pro_price=" + h_pro_price + ", h_pro_info1=" + h_pro_info1 + ", h_pro_infor2=" + h_pro_infor2
				+ ", h_pro_infor3=" + h_pro_infor3 + ", h_pro_modify=" + h_pro_modify + "]";
	}
}
