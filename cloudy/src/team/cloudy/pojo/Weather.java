package team.cloudy.pojo;

import java.util.Date;

/**
 * @author liuwang  
 * @date 2018��10��26�� ����4:46:44  
 * @version 1.0  
 * @TODO ����
 */
public class Weather {
	private String address;
	private Date time;
	private double temperature;
	private double humidity;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
}
