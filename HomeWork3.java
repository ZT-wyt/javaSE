package com.ZTday1;
/**
 * 使用变量名描述火车票的信息
 * @author ZT
 * @date 2020年4月10日
 *
 */
public class HomeWork3 {
	public static void main(String[] args) {
		String trainNum = "G520";//车次
		String origin = "苏州站";//起点
		String finish = "常州站";//终点
		String startTime = "09:45";//出发时间
		String seatNum = "02车01A号";//座位号
		double price = 34.5;//票价
		long idCard = 320482197805202319L; //身份证号
		String name = "xxx"; //乘车人姓名
		
		
		System.out.println("车次:" + trainNum);
		System.out.println("起点:" + origin);
		System.out.println("终点:" + finish);
		System.out.println("出发时间:" + startTime);
		System.out.println("座位号:" + seatNum);
		System.out.println("票价:" + price + "元");
		System.out.println("身份证号:" + idCard);
		System.out.println("乘车人姓名:" + name);
}
}
