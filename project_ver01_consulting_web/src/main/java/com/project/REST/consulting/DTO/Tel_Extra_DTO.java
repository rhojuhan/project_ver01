package com.project.REST.consulting.DTO;

public class Tel_Extra_DTO {
	private int tel_code;
	private int extra_code;
	private String extra_name;
	private int extra_price;
	private String extra_infor1;
	private String extra_infro2;
	private String extra_infor3;
	private String extra_modify;
	public int getTel_code() {
		return tel_code;
	}
	public void setTel_code(int tel_code) {
		this.tel_code = tel_code;
	}
	public int getExtra_code() {
		return extra_code;
	}
	public void setExtra_code(int extra_code) {
		this.extra_code = extra_code;
	}
	public String getExtra_name() {
		return extra_name;
	}
	public void setExtra_name(String extra_name) {
		this.extra_name = extra_name;
	}
	public int getExtra_price() {
		return extra_price;
	}
	public void setExtra_price(int extra_price) {
		this.extra_price = extra_price;
	}
	public String getExtra_infor1() {
		return extra_infor1;
	}
	public void setExtra_infor1(String extra_infor1) {
		this.extra_infor1 = extra_infor1;
	}
	public String getExtra_infro2() {
		return extra_infro2;
	}
	public void setExtra_infro2(String extra_infro2) {
		this.extra_infro2 = extra_infro2;
	}
	public String getExtra_infor3() {
		return extra_infor3;
	}
	public void setExtra_infor3(String extra_infor3) {
		this.extra_infor3 = extra_infor3;
	}
	public String getExtra_modify() {
		return extra_modify;
	}
	public void setExtra_modify(String extra_modify) {
		this.extra_modify = extra_modify;
	}
	@Override
	public String toString() {
		return "Tel_Extra_DTO [tel_code=" + tel_code + ", extra_code=" + extra_code + ", extra_name=" + extra_name
				+ ", extra_price=" + extra_price + ", extra_infor1=" + extra_infor1 + ", extra_infro2=" + extra_infro2
				+ ", extra_infor3=" + extra_infor3 + ", extra_modify=" + extra_modify + "]";
	}
}
