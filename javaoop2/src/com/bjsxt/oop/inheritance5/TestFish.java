package com.bjsxt.oop.inheritance5;

public class TestFish {

	public static void main(String[] args) {
		Fish fish = new Fish(3,5);
		fish.introduce();
		fish.swim();
		
		System.out.println(fish.toString());
		
		Fish fish2 = new Fish(3,5);
		System.out.println(fish.equals(fish2));

	}

}
