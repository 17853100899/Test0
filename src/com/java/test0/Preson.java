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
		System.out.println("������" + name + "\n���䣺" + age + "\n��ߣ�" + height + "\n���أ�" + weight);
	}

	public void normalWeight() {
		if (((age - 80) * 0.7 >= weight * 1.1) && ((age - 80) * 0.7 <= weight * 0.9)) {
			System.out.println("������������Χ��");
		} else {
			System.out.println("���ز���������Χ��");
		}
	}

	public void Obesity() {
		if (((age - 80) * 0.7 >= weight * 1.2)) {
			System.out.println("����");
		} else if (((age - 80) * 0.7 >= weight * 1.1) && ((age - 80) * 0.7 <= weight * 0.9)) {
			System.out.println("������");
		}
	}

}
