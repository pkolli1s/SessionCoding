package com.n2s.oops;

public interface Ifc1 
{
public static final int Ifc1_x = 5;

public abstract int add(int x, int y);

public default void test3() // if we need normal method we should use default method manually
{
	System.out.println("Hello");
	}

}
