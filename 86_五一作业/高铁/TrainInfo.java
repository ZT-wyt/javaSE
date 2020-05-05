package com.ZT.train;

public class TrainInfo {
	
	private String trainNum;//车次
	private String seat;//座位
	private String site;//站点
	
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	public TrainInfo(String trainNum, String seat, String site) {
		super();
		this.trainNum = trainNum;
		this.seat = seat;
		this.site = site;
	}
	
	

}
