package com.qspiders.abstraction;

abstract class GrandFather
{
	abstract public void houseone();
	abstract public void housetwo();
}
 abstract class Father extends GrandFather
 {
	 public void houseone()
	 {
		 System.out.println("House One Completed");
	 }
 }

 class Son extends Father
 {
	 public void housetwo()
	 {
		 System.out.println("House Two Completed");
	 }
 }

public class AbstractTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son S1=new Son();
S1.houseone();
S1.housetwo();

	}

}
