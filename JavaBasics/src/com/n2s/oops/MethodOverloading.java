package com.n2s.oops;

public class MethodOverloading 
{
public static void main(String[] args) 
{
	MethodOverloading m = new MethodOverloading();
	System.out.println(m.met("Sunny"));
	System.out.println(m.met(2.9f, 8.9f));
	System.out.println(m.met(5, 10));
	System.out.println(m.met(5, 8, 15));
	
}
public int met(int x, int y)
{
	return x+y;
}
public int met (int x, int y, int z)
{
	return x+y+z;
}
public float met(float x, float y)
{
	return x+y;
}
public String met(String s)
{
	return s;
}
}

