package com;

//interface:


/*
interface Shape1
{
	void area();//abstract public void area();
	
	
}




class Square1 implements Shape1
{
	int num;
	 Square1()
	{
		num=4;
	}
	
	public void area() {
		System.out.println("Square area"+(num*num));
		
	}
	
}


class Rectangle1 implements Shape1
{
	int l,w;
	Rectangle1()
	{
		l=4;
		w=6;
	}
	
	public void area() {
		System.out.println("Rectangle area"+(l*w));
		
	}
	
}


public class TestInterface {

	public static void main(String[] args) {
		
		Shape1 s,s1;
		
		s=new Square1();
		
		
		s.area();
		
		s1=new Rectangle1();
		s1.area();
		

	}

}


*/

/*

interface Shape1
{
	void area();//abstract public void area();
	
	
}

interface Display extends Shape1
{
	void display();
}




class Square1 implements Display
{
	int num;
	 Square1()
	{
		num=4;
	}
	
	public void area() {
		System.out.println("Square area"+(num*num));
		
	}
	
	public void display()
	{
		System.out.println("display in square");
		
	}
	
}


class Rectangle1 implements Shape1
{
	int l,w;
	Rectangle1()
	{
		l=4;
		w=6;
	}
	
	public void area() {
		System.out.println("Rectangle area"+(l*w));
		
	}
	
}


public class TestInterface {

	public static void main(String[] args) {
		
		Shape1 s,s1;
		
		s=new Square1();
		
		
		s.area();
		
		s1=new Rectangle1();
		s1.area();
		

	}

}


*/


interface Shape1
{
	void area();//abstract public void area();
	
	interface Display 
	{
		void display();
	}
	
	
}






class Square1 implements Shape1,Shape1.Display
{
	int num;
	 Square1()
	{
		num=4;
	}
	
	
	@Override
	public void display() {
		
		System.out.println("Display in Square");
		
	}


	@Override
	public void area() {
		
		System.out.println("Square area"+(num*num));
	}
	
	
	
}


class Rectangle1 implements Shape1
{
	int l,w;
	Rectangle1()
	{
		l=4;
		w=6;
	}
	
	public void area() {
		System.out.println("Rectangle area"+(l*w));
		
	}
	
}


public class TestInterface {

	public static void main(String[] args) {
		
		Shape1.Display s;
		
		 s=new Square1();
		
	
		s.display();
		
		Shape1 s1;
		s1=new Square1();
		
		s1.area();
		

	}












	interface I1{
	void display();
}

interface I2{
	void display();
}

class B1 implements I2,I1 {
	
	public void display() {
		System.out.println("Displaying I1 ");
	}
	
	
}
public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A b=new B1();
		//b.display();
		
		B1 a = new B1();
		a.display();

	}

}

}





