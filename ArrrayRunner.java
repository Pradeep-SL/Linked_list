package com.jso.LinkedList;

public class ArrrayRunner {
//	added comment

	public static void main(String[] args) 
	{
		MyLinkedlist l=new MyLinkedlist();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
//		l.remove(0);
		for (int i=0;i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println(l);
		
	}

}
