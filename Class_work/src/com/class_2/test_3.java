package com.class_2;


//题目：创建一个名为Animal的父类，具有一个名为makeSound()的方法，方法内输出动物发出的声音。
//创建一个名为Dog的子类，继承自Animal类，并重写makeSound()方法以输出"汪汪汪"。
//在主函数中创建一个Dog对象，并调用makeSound()方法。
class Animal{
	public void makeSound() {
		System.out.println("动物发出的声音");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("汪汪汪");
	}
}

public class test_3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}

}
