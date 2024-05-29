package com.class_2;

//题目：编写Java程序，用于显示人的姓名和年龄。 定义一个人类（Person），该类中有两个属性，
//姓名（name）和年龄（age）。定义构造方法（至少2种），用来初始化数据成员。再定义显示（display）方法，
//将姓名和年龄打印出来。在main方法中创建人类的实例，然后将信息显示

class Person{
	
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Person(String name) {
		this.name=name;
		this.age=0;
	}
	public void display() {
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
}


public class test_2 {
	public static void main(String[] args) {
		Person p1 = new Person("mike",22);
		Person p2 = new Person("alice",20);
		p1.display();
		p2.display();
	}

}
