package com.lesson1.assistedProjects;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		System.out.println("Implicit Type Casting Process");
		System.out.println("-------------------------------");
		
		char c='H';
		System.out.println("The value of character is = "+ c);
		
		int i=c;
		System.out.println("The value of integer is = "+ i);
		
		float f=c;
		System.out.println("The value of float is = "+ f);
		
		long l=c;
		System.out.println("The value of long is = "+ l);
		
		double d=c;
		System.out.println("The value of double is = "+ d);
		
		System.out.println(" ");
		
		System.out.println("Explicit type casting");
		System.out.println("----------------------");
		
		double y=99.9;
		int z=(int)y;
		System.out.println("The value of double is = "+y);
		System.out.println("The value of z is = "+z);

	}

}
