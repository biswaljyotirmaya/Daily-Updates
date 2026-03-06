package com.jb.beans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("spartanbat")
@Lazy
public class Spartan implements ICricketBat {

	Spartan() {
		System.out.println("Spartan Constructor");
	}

	@Override
	public int scoreRuns() {
		System.out.println("Scoring runs by Spartan");
		return new Random().nextInt(230);
	}

}
