package com.class_2;

import java.util.ArrayList;

//生成10个1-20之间的随机数，随机数不能重复
public class Random {
	public static void main(String[] args) {
		int count=0;
		ArrayList<Integer> list = new ArrayList<>();
		int i = (int)(Math.random()*20+1);
		while(count<10) {
			if(list.size()!=0) {
				if(list.indexOf(i)!=-1) {
					continue;
				}
			}
			list.add(i);
			count++;
		}
		list.forEach(System.out::println);
	}
	
}





//int count=0;
//ArrayList<Integer> list = new ArrayList<>();
//while(count<10) {
//	int i =(int)(Math.random()*20+1);
//	if(list.size()!=0) {
//		if(list.indexOf(i)!=-1) {
//			continue;
//		}
//	}
//	list.add(i);
//	count++;
//}
//list.forEach(System.out::println);