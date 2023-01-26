package com.n2s.oops;  

public interface Ifc2 extends Ifc3
{
public static final int Ifc2_y = 5; // By default variable is final even without using final keyword

public abstract int sub(int x, int y); // By default method is abstract even without using abstract keyword





public static void test2()
{
	System.out.println("Hi");
	}

/*private  void test3()
{Private method in interface is allowed from java9
	}*/ 
}