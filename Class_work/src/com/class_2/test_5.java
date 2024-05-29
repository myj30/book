package com.class_2;

class Counter{
	static int total;
	int number;
	Counter(){
		total++;
		number++;
	}
}

public class test_5 {
	public static void main(String[] args) {
		Counter c =null;
		for(int i=1;i<3;i++)
			c=new Counter();
		System.out.println("number="+c.number+"/total="+c.total);
	}
}
