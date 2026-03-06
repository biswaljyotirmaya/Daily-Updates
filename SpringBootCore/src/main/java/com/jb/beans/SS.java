package com.jb.beans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ssbat")
@Lazy
public class SS implements ICricketBat {

	SS() {
		System.out.println("SS Constructor");
	}

	@Override
	public int scoreRuns() {
		System.out.println("Scoring runs by SS");
		return new Random().nextInt(230);
	}

}
