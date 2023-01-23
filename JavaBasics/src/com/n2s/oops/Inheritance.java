package com.n2s.oops;

public class Inheritance {

	public static void main(String[] args)
	{
		C c = new C();
		c.method1();
		c.method3();
		c.method2();

	}

}
class A 
{
public void method1()
{
	System.out.println("Hi");
}
}
class B extends A
{
	public void method2()
	{
		System.out.println("Hello");
	}

}
class C extends B
{
	public void method3()
	{
		System.out.println("World");
	}
}