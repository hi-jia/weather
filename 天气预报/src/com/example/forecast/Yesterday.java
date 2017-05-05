package com.example.forecast;

public class Yesterday {
	 public String date;
	 public String fl;
	 public String fx;
	 public String high;
	 public String low;
	 public String type;
	 
	 
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getFengli() {
		return fl;
	}


	public void setFengli(String fengli) {
		this.fl = fengli;
	}


	public String getFengxiang() {
		return fx;
	}


	public void setFengxiang(String fengxiang) {
		this.fx = fengxiang;
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
		return "Yesterday [date=" + date + ", fengli=" + fl
				+ ", fengxiang=" + fx + ", high=" + high + ", low="
				+ low + ", type=" + type + "]";
	}
	 
}
