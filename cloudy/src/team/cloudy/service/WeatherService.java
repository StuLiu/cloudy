package team.cloudy.service;

import java.util.Date;

import team.cloudy.pojo.Weather;

public interface WeatherService {
	
	/**
	 * @author liuwang  
	 * @date 2018��10��26�� ����4:49:26  
	 * @version 1.0   
	 * @TODO ��ѯĳ��ĳʱ������״��
	 * @param [�ص㣬ʱ��]
	 * @return ��������
	 */
	public abstract Weather getWeather(String address, Date time);
}
