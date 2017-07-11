package com.project.REST.consulting.DTO;

public class Tel_Plan_DTO {
	private int tel_code;
	private int plan_code;
	private String plan_name;
	private int plan_price;
	private String plan_infor1;
	private String plan_infor2;
	private String plan_infor3;
	private int plan_sale;
	private String plan_modify;
	
	public int getTel_code() {
		return tel_code;
	}
	public void setTel_code(int tel_code) {
		this.tel_code = tel_code;
	}
	public int getPlan_code() {
		return plan_code;
	}
	public void setPlan_code(int plan_code) {
		this.plan_code = plan_code;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public int getPlan_price() {
		return plan_price;
	}
	public void setPlan_price(int plan_price) {
		this.plan_price = plan_price;
	}
	public String getPlan_infor1() {
		return plan_infor1;
	}
	public void setPlan_infor1(String plan_infor1) {
		this.plan_infor1 = plan_infor1;
	}
	public String getPlan_infor2() {
		return plan_infor2;
	}
	public void setPlan_infor2(String plan_infor2) {
		this.plan_infor2 = plan_infor2;
	}
	public String getPlan_infor3() {
		return plan_infor3;
	}
	public void setPlan_infor3(String plan_infor3) {
		this.plan_infor3 = plan_infor3;
	}
	public int getPlan_sale() {
		return plan_sale;
	}
	public void setPlan_sale(int plan_sale) {
		this.plan_sale = plan_sale;
	}
	public String getPlan_modify() {
		return plan_modify;
	}
	public void setPlan_modify(String plan_modify) {
		this.plan_modify = plan_modify;
	}
	@Override
	public String toString() {
		return "Tel_Plan_DTO [tel_code=" + tel_code + ", plan_code=" + plan_code + ", plan_name=" + plan_name
				+ ", plan_price=" + plan_price + ", plan_infor1=" + plan_infor1 + ", plan_infor2=" + plan_infor2
				+ ", plan_infor3=" + plan_infor3 + ", plan_sale=" + plan_sale + ", plan_modify=" + plan_modify + "]";
	}
}
