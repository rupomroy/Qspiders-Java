package com.qspiders.abstraction;
abstract class Shape
{
	abstract public void area();
}
class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("area of rectangle");
	}
}

class Triangle extends Shape
{
	public void area()
	{
		System.out.println("area of Triangle");
}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("area of circle");
	}
}
public class AbstractFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c1=new Circle();
c1.area();
Rectangle C2=new Rectangle();
C2.area();
	Triangle c3=new Triangle();
c3.area();
	}
}
