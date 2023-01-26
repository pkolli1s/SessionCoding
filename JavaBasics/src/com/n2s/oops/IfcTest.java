package com.n2s.oops;

public class IfcTest implements Ifc1, Ifc2 {

	public static void main(String[] args) {
		IfcTest ifc = new IfcTest();
		ifc.test3();
		Ifc2.test2();
		
		System.out.println(ifc.add(Ifc1_x, Ifc2_y));
		System.out.println(ifc.sub(Ifc1_x, Ifc2_y));
		System.out.println(ifc.mult(Ifc1_x, Ifc2_y)  );
		

	}

	@Override
	public int sub(int x, int y) {
		
		return x-y;
	}

	@Override
	public int add(int x, int y) {
		
		return x+y;	
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
