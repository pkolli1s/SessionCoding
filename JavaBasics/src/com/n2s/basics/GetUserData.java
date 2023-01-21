package com.n2s.basics;

import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) 
	{
	Scanner S = new Scanner(System.in);
	System.out.println("Enter Your Name?");
	String Name = S.next();
	System.out.println("Enter your age?");
	int age = S.nextInt();
	System.out.println("Name is:" +Name   +     " age is:"+age);
	S.close();

	}

}
