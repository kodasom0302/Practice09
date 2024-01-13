package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	Goods obj01=new Goods();
    	obj01.setName(sc.next());
    	obj01.setPrice(sc.nextInt());
    	obj01.setCount(sc.nextInt());
    	
    	Goods obj02=new Goods();
    	obj02.setName(sc.next());
    	obj02.setPrice(sc.nextInt());
    	obj02.setCount(sc.nextInt());
    	
    	Goods obj03=new Goods();
    	obj03.setName(sc.next());
    	obj03.setPrice(sc.nextInt());
    	obj03.setCount(sc.nextInt());
    	
    	List<Goods> gList=new ArrayList<Goods>();
    	gList.add(obj01);
    	gList.add(obj02);
    	gList.add(obj03);
    	
    	if (sc.next().equals("q")) {
    		sc.close();
    		System.out.println("[입력완료]");
    		System.out.println("=============================");
    		gList.size();
    	}

       
    }

}
