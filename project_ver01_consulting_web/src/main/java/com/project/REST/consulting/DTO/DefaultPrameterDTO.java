package com.project.REST.consulting.DTO;

public class DefaultPrameterDTO {
	private int tel_code;
	private int plan_code;
	private int makerCode;
	private int productCode;
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
	public int getMakerCode() {
		return makerCode;
	}
	public void setMakerCode(int makerCode) {
		this.makerCode = makerCode;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	@Override
	public String toString() {
		return "DefaultPrameterDTO [tel_code=" + tel_code + ", plan_code=" + plan_code + ", makerCode=" + makerCode
				+ ", productCode=" + productCode + "]";
	}
	
}
