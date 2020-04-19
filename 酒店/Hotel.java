package com.ZTday0419;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
		while (true) {
			System.out.println("\r" + "请您挑选酒店" + "\r");
			String[] str = {"1.格林豪泰苏州火车站南广场拙政园商务酒店","2.格雅苏州工业园区金鸡湖东方之门酒店","3.格林豪泰苏州漕湖工业园智选酒店"};
			for (String HotelName : str) {			
				System.out.println(HotelName);
			}		
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("地址:江苏省苏州市姑苏区人民路2156号");
				hotel1();
				break;
			case 2:
				System.out.println("地址:江苏省苏州工业园区星海街169号");
				hotel2();
				break;
			case 3:
				System.out.println("江苏省苏州市相城区黄畦路3号");
				hotel3();
				break;
			default:
				System.out.println("你的选择不在范围内");
				break;
			}

		}
		
	}
	
	public static void hotel1() {		
		System.out.println("\r" + "请选择房型");
		System.out.println("1.大床房   2.标间   3.豪华双床房");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			String rackRate1 = "189RMB";
			String memberPrice1 = "161RMB";
			String voucher1 = "20RMB";
			System.out.println("门市价:" + rackRate1 + "\r" + "会员专享价:" + memberPrice1 + "\r" + "代金券:" +voucher1);
			break;
		case 2:
			String rackRate2 = "169RMB";
			String memberPrice2 = "149RMB";
			String voucher2 = "10RMB";
			System.out.println("门市价:" + rackRate2 + "\r" + "会员专享价:" + memberPrice2 + "\r" + "代金券:" +voucher2);
			break;
		case 3:
			String rackRate3 = "209RMB";
			String memberPrice3 = "190RMB";
			String voucher3 = "30RMB";
			System.out.println("门市价:" + rackRate3 + "\r" + "会员专享价:" + memberPrice3 + "\r" + "代金券:" +voucher3);
		default:
			System.out.println("你的选择不在范围内");
			break;
		}
		
	}
	
	public static void hotel2() {
		System.out.println("\r" + "请选择房型");
		System.out.println("1.豪华双床房");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		if (choose == 1) {
			String rackRate1 = "399RMB";
			String memberPrice1 = "339RMB";
			String voucher1 = "20RMB";
			System.out.println("门市价:" + rackRate1 + "\r" + "会员专享价:" + memberPrice1 + "\r" + "代金券:" +voucher1);
		}else {
				System.out.println("你的选择不在范围内");
			}
					
		}
	
	public static void hotel3() {
		System.out.println("\r" + "请选择房型");
		System.out.println("1.高级大床房");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		if (choose == 1) {
			String rackRate1 = "189RMB";
			String memberPrice1 = "161RMB";
			String voucher1 = "10RMB";
			System.out.println("门市价:" + rackRate1 + "\r" + "会员专享价:" + memberPrice1 + "\r" + "代金券:" +voucher1);
		}else {
				System.out.println("你的选择不在范围内");
			}
					
		}
	
	
	}

