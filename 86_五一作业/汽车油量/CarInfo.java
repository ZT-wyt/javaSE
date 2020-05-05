package com.ZT.car;

public class CarInfo {
	
	private String carMake;//品牌
	private String carType;//车型
	private String price;//价格
	private double consume;//油耗
	private double mileage;//里程数
	private double oilBoxSize;//油箱容积
	private double innage;//剩余油量
	
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public double getConsume() {
		return consume;
	}
	public void setConsume(Double consume) {
		this.consume = consume;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}
	public double getOilBoxSize() {
		return oilBoxSize;
	}
	public void setOilBoxSize(Double oilBoxSize) {
		this.oilBoxSize = oilBoxSize;
	}
	public double getInnage() {
		return innage;
	}
	public void setInnage(Double innage) {
		this.innage = innage;
	}
	
	public CarInfo(String carMake, String carType, String price, Double consume, Double mileage, Double oilBoxSize,
			Double innage) {
		super();
		this.carMake = carMake;
		this.carType = carType;
		this.price = price;
		this.consume = consume;
		this.mileage = mileage;
		this.oilBoxSize = oilBoxSize;
		this.innage = innage;
	}
	@Override
	public String toString() {
		return "CarInfo [carMake=" + carMake + ", carType=" + carType + ", price=" + price + ", consume=" + consume
				+ ", mileage=" + mileage + ", oilBoxSize=" + oilBoxSize + ", innage=" + innage + "]";
	}
	
	
	
	

}
