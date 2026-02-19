package com.jb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controllers {

	@GetMapping("/ping")
	public String ping() {
		return "ok";
	}

	@GetMapping("/sum")
	public int sum() {
		int arr[] = new int[] { 1, 2, 34, 32, 5, 5, 6, 734 };
		int s = 0;
		for (int i : arr) {
			s += i;
		}
		return s;
	}
}
