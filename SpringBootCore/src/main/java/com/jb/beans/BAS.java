package com.jb.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("basbat")
public class BAS implements ICricketBat {

	BAS() {
		System.out.println("BAS Constructor");
	}

	@Override
	public int scoreRuns() {
		System.out.println("Scoring runs by BAS");
		return new Random().nextInt(230);
	}

}
