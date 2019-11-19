package com.sutherland.AutowireByName;

public class A {
	B b;
	
	A()
	{
		this.b=b;
		System.out.println("A is created[A constructor is called]");
	}
	A(B b)
	{
		this.b=b;
		System.out.println("A 1 is created[A constructor is called] i=");
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
