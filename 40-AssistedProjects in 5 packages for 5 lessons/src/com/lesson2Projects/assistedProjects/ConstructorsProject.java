package com.lesson2.assistedProjects;

public class Constructors 
{

	public static void main(String[] args) 
	{
		//Default constructor
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();
		System.out.println("Default Constructor");
		emp1.display();
		emp2.display();

		//parameterized constructor
		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		System.out.println("Parameterized constructor");
		std1.display();
		std2.display();
		
	}

}
//Default constructor
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

