package com.java.test0;

public class Preson {
	String name;
	int age, height, weight;

	public Preson(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void describe() {
		System.out.println("姓名：" + name + "\n年龄：" + age + "\n身高：" + height + "\n体重：" + weight);
	}

	public void normalWeight() {
		if (((age - 80) * 0.7 >= weight * 1.1) && ((age - 80) * 0.7 <= weight * 0.9)) {
			System.out.println("体重在正常范围内");
		} else {
			System.out.println("体重不在正常范围内");
		}
	}

	public void Obesity() {
		if (((age - 80) * 0.7 >= weight * 1.2)) {
			System.out.println("肥胖");
		} else if (((age - 80) * 0.7 >= weight * 1.1) && ((age - 80) * 0.7 <= weight * 0.9)) {
			System.out.println("不肥胖");
		}
	}

}
