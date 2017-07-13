package com.project.REST.consulting.DTO;

public class MakerProductDTO {
	
	private Integer makerCode;
	private Integer productCode;
	private String productName;
	private Integer productPrice;
	private String producrINfor_os;
	private String producrINfor_cpu;
	private String producrINfor_camera;
	private String producrINfor_memory;
	private Integer producrINfor_ratings;
	private String producrINfor_ratings_infor;
	
	public Integer getMakerCode() {
		return makerCode;
	}
	public void setMakerCode(Integer makerCode) {
		this.makerCode = makerCode;
	}
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public String getProducrINfor_os() {
		return producrINfor_os;
	}
	public void setProducrINfor_os(String producrINfor_os) {
		this.producrINfor_os = producrINfor_os;
	}
	public String getProducrINfor_cpu() {
		return producrINfor_cpu;
	}
	public void setProducrINfor_cpu(String producrINfor_cpu) {
		this.producrINfor_cpu = producrINfor_cpu;
	}
	public String getProducrINfor_camera() {
		return producrINfor_camera;
	}
	public void setProducrINfor_camera(String producrINfor_camera) {
		this.producrINfor_camera = producrINfor_camera;
	}
	public String getProducrINfor_memory() {
		return producrINfor_memory;
	}
	public void setProducrINfor_memory(String producrINfor_memory) {
		this.producrINfor_memory = producrINfor_memory;
	}
	public Integer getProducrINfor_ratings() {
		return producrINfor_ratings;
	}
	public void setProducrINfor_ratings(Integer producrINfor_ratings) {
		this.producrINfor_ratings = producrINfor_ratings;
	}
	public String getProducrINfor_ratings_infor() {
		return producrINfor_ratings_infor;
	}
	public void setProducrINfor_ratings_infor(String producrINfor_ratings_infor) {
		this.producrINfor_ratings_infor = producrINfor_ratings_infor;
	}
	@Override
	public String toString() {
		return "MakerProductDTO [makerCode=" + makerCode + ", productCode=" + productCode + ", productName="
				+ productName + ", productPrice=" + productPrice + ", producrINfor_os=" + producrINfor_os
				+ ", producrINfor_cpu=" + producrINfor_cpu + ", producrINfor_camera=" + producrINfor_camera
				+ ", producrINfor_memory=" + producrINfor_memory + ", producrINfor_ratings=" + producrINfor_ratings
				+ ", producrINfor_ratings_infor=" + producrINfor_ratings_infor + "]";
	}
}
