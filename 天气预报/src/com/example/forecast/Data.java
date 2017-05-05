package com.example.forecast;

import java.util.ArrayList;

public class Data {
	String city;
	Yesterday yesterday;
	ArrayList<Day> forecast;
	String ganmao;
	String wendu;
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public Data(String city, Yesterday yesterday, ArrayList<Day> forecast,
			String ganmao, String wendu) {
		super();
		this.city = city;
		this.yesterday = yesterday;
		this.forecast = forecast;
		this.ganmao = ganmao;
		this.wendu = wendu;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Yesterday getYesterday() {
		return yesterday;
	}
	public void setYesterday(Yesterday yesterday) {
		this.yesterday = yesterday;
	}
	public ArrayList<Day> getForecast() {
		return forecast;
	}
	public void setForecast(ArrayList<Day> forecast) {
		this.forecast = forecast;
	}
	public String getGanmao() {
		return ganmao;
	}
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}
	public String getWendu() {
		return wendu;
	}
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	@Override
	public String toString() {
		return "Data [city=" + city + ", yesterday=" + yesterday
				+ ", forecast=" + forecast + ", ganmao=" + ganmao + ", wendu="
				+ wendu + "]";
	}
	

}
