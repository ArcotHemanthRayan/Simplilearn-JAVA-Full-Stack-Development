package com.lesson1.assistedProjects;

import com.NewPackage.AccessModifiers;

class AccessModifier1 extends AccessModifiers
{

	public static void main(String[] args) 
	{
		PrivateAccess pam=new PrivateAccess();
//		System.out.println(am.a); // we can't access private variables
//		am.method();// we can't access private methods
		
		DefaultAccess dam=new DefaultAccess();
		dam.defaultMethod();
		
		AccessModifier1 am=new AccessModifier1();
		am.display();
		
		PublicAccess pa=new PublicAccess();
		pa.display();
	}

}

class PrivateAccess
{
	private int a=100;
	
	private void method()
	{
		System.out.println("This is private method");
	}
	
}

class DefaultAccess
{
	void defaultMethod()
	{
		System.out.println("This is a default method");
	}
}

class PublicAccess
{
	public void display()
	{
		System.out.println("This is a public method");
	}
}
