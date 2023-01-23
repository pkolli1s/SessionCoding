
package com.n2s.oops;

public class MethodOverriding extends SuperRiding
{
public static void main(String[] args) 
{
	MethodOverriding m = new MethodOverriding();
	m.msg();
    
	
}
public void msg()
{
	System.out.println("MethodOver Riding is Executed");
    super.msg();

}

}
class SuperRiding
{
	public void msg()
	{
		System.out.println("Super Riding is Executed");
	}
}
