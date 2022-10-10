package com.example.InterfaceSample.chapter03.used;

public class EveningGreet implements Greet {
	@Override
	public void greeting() {
		System.out.println("------좋은 저녁입니다------");
	}
}
