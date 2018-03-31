package com.qspiders.abstraction;

abstract class A //we cannot create object for abstract class because it is imcomplete//
{
	abstract public void run();
	public void wish() //incomplete method//
	{
		System.out.println("Happy Sunday");
	}
}
class B extends A
{
	public void run()
	{
		System.out.println("happy new year");
	}
}
	
public class AbstractionOne {
public static void main(String[] args) {
		// TODO Auto-generated method stub
   B a1=new B();
   a1.wish();
   a1.run();
	}

}
