package com.example.forecast;

import java.util.ArrayList;


public  class Json {

	public Data data;
	public String desc;
	public String status;
	
	
	public Data getData() {
		return data;
	}


	public void setData(Data data) {
		this.data = data;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Json [data=" + data + ", desc=" + desc + ", status=" + status
				+ "]";
	}
	
	 
}
