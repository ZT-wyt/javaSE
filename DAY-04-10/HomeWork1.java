package com.ZTday1;
/**
 * 使用变量名描述公交车的信息
 * @author ZT
 * @date 2020年4月10日
 *
 */

public class HomeWork1 {
	public static void main(String[] args) {
		String busMake = "宇通,金龙";  //品牌
		double busLength = 9.5;        //长
		double busWidth = 2.5;         //宽
		int seatNum = 30;              //座位数
		int way = 106;                 //几路车
		char color = '绿';
		
		System.out.println("品牌:" + busMake);
		System.out.println("长度:" + busLength +"米");
		System.out.println("宽度:" + busWidth + "米");
		System.out.println("座位数:" + seatNum + "个");
		System.out.println("几路车:" + way + "路");
		System.out.println("颜色:" + color + "色");
	}

}
