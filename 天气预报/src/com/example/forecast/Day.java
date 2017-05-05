package com.example.forecast;

public class Day {
	 public String date;
	 public String fengli;
	 public String fengxiang;
	 public String high;
	 public String low;
	 public String type;
	public Day() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Day(String date, String fengli, String fengxiang, String high,
			String low, String type) {
		super();
		this.date = date;
		this.fengli = fengli;
		this.fengxiang = fengxiang;
		this.high = high;
		this.low = low;
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFengli() {
		return fengli;
	}
	public void setFengli(String fengli) {
		this.fengli = fengli;
	}
	public String getFengxiang() {
		return fengxiang;
	}
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Day [date=" + date + ", fengli=" + fengli + ", fengxiang="
				+ fengxiang + ", high=" + high + ", low=" + low + ", type="
				+ type + "]";
	}
	 
	
}
