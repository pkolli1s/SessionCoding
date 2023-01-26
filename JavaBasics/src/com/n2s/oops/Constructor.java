package com.n2s.oops;

public class Constructor {

	public static void main(String[] args) 
	{

		Constructor c = new Constructor("Sunny", 8);
		
		
		Child c1 = new Child();
		 
	}
	Constructor()
	{
		System.out.println("I am in a default constructor");
	}
	
	Constructor(int x)
	{
		System.out.println("I am in a single param constructor " +x);
	}
	
	Constructor(String s, int x)
	{
		this();
		System.out.println("I am in a two param constructor " + s + "  " + x);
	}
	
}

class Child extends Constructor{
	Child(){
		super(8);
		System.out.println("I am in child constructor");
	}
	
}

