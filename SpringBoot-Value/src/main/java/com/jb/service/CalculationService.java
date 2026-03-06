package com.jb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

	@Value("#{10 + 20}")
	private int sum;

	@Value("#{5 * 10}")
	private int multiplication;

	@Value("#{T(java.lang.Math).pow(2,3)}")
	private double power;

	@Value("#{systemProperties['os.name']}")
	private String os;

	public String showCalculations() {
		return "Sum = " + sum + ", Multiplication = " + multiplication + ", Power = " + power + ", OS = " + os;
	}
}