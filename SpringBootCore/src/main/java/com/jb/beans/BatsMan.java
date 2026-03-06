package com.jb.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("batsman")
public final class BatsMan {
	@Autowired
	@Qualifier("spartanbat")
	private ICricketBat bat;

	public BatsMan() {
		System.out.println("Constructor from the Cricketer");
	}

	public String batting() {
		System.out.println("Batsman batting: ");
		int run = bat.scoreRuns();
		return "Batsman scored " + run + " runs";
	}
}
