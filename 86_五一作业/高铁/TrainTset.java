package com.ZT.train;

public class TrainTset {
	
	public static void main(String[] args) {
		TrainInfo trainInfo = new TrainInfo("G7029", "一等座", "镇江");
		String[] Site = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
		if (trainInfo.getSeat() == "一等座") {
			double p1 =firstClass(trainInfo.getSite(), Site);
			System.out.println("车次:" + trainInfo.getTrainNum());
			System.out.println("座位:" + trainInfo.getSeat());
			System.out.println(trainInfo.getSite() +":" + p1 + "元");
		}else {
			double p2 =secondClass(trainInfo.getSite(),Site);
			System.out.println("车次:" + trainInfo.getTrainNum());
			System.out.println("座位:" + trainInfo.getSeat());
			System.out.println(trainInfo.getSite() +":" + p2 + "元");			
		}	
	}
	
	//一等座
	public static double firstClass(String site,String[] firstSite) {
		double price = 0;		
		double[] firstClassPrice ={0,44.5,64.5,99.5,129.5,159.5,219.5};
		for (int i = 0; i < firstSite.length ; i++) {
			for (int j = 0; j < firstClassPrice.length ; j++) {
				if (site == firstSite[i] && i == j) {
					price = firstClassPrice[j];
				}
				
			}
			
		}
		return price;		
	}
	
	//二等座
	public static double secondClass(String site,String[] secondSite) {
		double price = 0;
		double[] secondClassPrice ={0,29.5,39.5,64.5,79.5,99.5,139.5};
		for (int i = 0; i < secondSite.length ; i++) {
			for (int j = 0; j < secondClassPrice.length ; j++) {
				if (site == secondSite[i] && i == j) {
					price = secondClassPrice[j];
				}				
			}	
		}
		return price;		
	}

}
