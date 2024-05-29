package com.class_2;

import java.util.Scanner;

//题目：用面向对象方法设计Circle类，有半径成员，求面积和周长方法。
//并设计测试类，输入半径（double型），可输出面积和周长。（PI用Math类中的PI.结果保留3位小数）

class Circle{
	private double r;

	public Circle(double r) {
		this.r=r;
	}
	
	public double getArea() {
		return Math.PI*r*r;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
}
public class circle_test {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入半径：");
		double r = sc.nextDouble();
		Circle  circle = new Circle(r);
		double area = circle.getArea();
		double perimeter = circle.getPerimeter();
		System.out.printf("圆的面积是：%.3f\n",area);
		System.out.printf("圆的周长是：%.3f\n",perimeter);

		
	}
}

