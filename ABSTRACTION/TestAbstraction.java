package com;
//Abstraction: Think only essential things leave it non essential things.
//Hide the complexity.
//1)  abstract class   2) interface

//abstract class can never be instantiated.



abstract class Shape
{
	int x;
	Shape()
	{
		
	}
	Shape(int x)
	{
		this.x=x;
	}
	abstract void area();//no defination
	
	void display()
	{
		System.out.println(x);
	}
	
	}

class Square extends Shape
{ 
	Square(int x)
	{
		super(x);
	}
	void area()
	{
		System.out.println("Area of square="+(4*4));
		
	}
	}


class Rectangle extends Shape
{

	void area()
	{
		System.out.println("Area of square="+(4*5));
		
	
	}
	}

public class TestAbstraction {

	public static void main(String[] args) {
		Shape s,s1;
		 s=new Square(10);
		 s.display();
		s.area();

		
		s1=new Rectangle();
		
		s1.area();
	}

}
