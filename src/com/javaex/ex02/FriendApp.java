package com.javaex.ex02;

import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	Friend f01=new Friend();
    	f01.setName(sc.next());
    	f01.setHp(sc.next());
    	f01.setSchool(sc.next());
    	
    	Friend f02=new Friend();
    	f02.setName(sc.next());
    	f02.setHp(sc.next());
    	f02.setSchool(sc.next());
    	
    	Friend f03=new Friend();
    	f03.setName(sc.next());
    	f03.setHp(sc.next());
    	f03.setSchool(sc.next());
    	
    	List<Friend> fList=new ArrayList<Friend>();
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	System.out.println(fList.size());


    	
    	
    }

}
