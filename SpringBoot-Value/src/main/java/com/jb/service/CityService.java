package com.jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cityservice")
public class CityService {

	@Value("#{'${app.cities}'.split(',')}")
	private List<String> cities;

	public void printCities() {
		cities.forEach(System.out::println);
	}
}