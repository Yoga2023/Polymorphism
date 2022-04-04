package com.overloading;

public class Overloading_Trail1 {

	public void studname() {
		System.out.println("Name: ARUN");
	}
	public void studname(int id)
	{
		System.out.println("Arun-"+id);
	}
	public void studname(String name,char initial,int id)
	{
		System.out.println( initial+name+id);
	}
	public static void main(String[] args) {
		Overloading_Trail1 ot=new Overloading_Trail1();
		ot.studname();
		ot.studname(2023);
		ot.studname(".ARUN-",'S',2023);
	}
}
