package com.class_2;



 //题目：创建一个名为Shape的父类，具有一个名为calculateArea()的抽象方法。
//创建一个名为Rectangle的子类，继承自Shape类，并实现calculateArea()方法以计算矩形的面积。
//在主函数中创建一个Rectangle对象，并调用calculateArea()方法。
abstract class Shape{
	  public abstract double calculateArea();
}

class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double calculateArea() {
		return width*height;
	}
}
public class test_4 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5.0,2.0);
		double area = rec.calculateArea();
		System.out.println("矩形面是："+area);

	}

}
