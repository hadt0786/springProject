package com.sutherland.AutowireByName;

public class A {
	B b;
	
	A()
	{
		System.out.println("A is created[A constructor is called]");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	void print()
	{
		System.out.println("hello A");
	}
	
	void dispaly()
	{
		print();
		b.print();
	}

}
