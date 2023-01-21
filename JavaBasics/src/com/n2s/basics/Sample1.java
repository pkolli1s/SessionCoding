package com.n2s.basics;

public class Sample1 {

	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		System.out.println("args.length");
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		Sample1 Sample = new Sample1();
		System.out.println(Sample.add(5, 8));
		System.out.println(Sample.sub(5, 6));
		

	}
     public int add(int x, int y)
     {
    	 return(x+y);
     }
     public int sub(int x, int y)
     {
    	 return(x-y);
     }
	
	

}
