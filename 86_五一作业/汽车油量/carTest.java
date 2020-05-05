package com.ZT.car;

public class carTest {

	public static void main(String[] args) {
		//品牌,车型,价格,油耗,里程数,油箱容积,剩余油量
		CarInfo carInfo = new CarInfo("奥迪", "A8", "85万", 8.6, 2200.0, 82.0, 80.0);
		System.out.println(carInfo.toString());
		
		double innage = run1(carInfo.getMileage(), carInfo.getConsume(), carInfo.getInnage());
		System.out.println(innage);
	}
	
	public static double run1(double mileage,double consume,double innage) {
		double innage1 = 0;
		double consumeOil = (mileage/100)*consume;//消耗油量
		if (consumeOil >= innage) {
			System.out.println("油量不足");
		}else {
			innage1 = (int)(innage - consumeOil);		
		}
		return innage1;
	}
}
