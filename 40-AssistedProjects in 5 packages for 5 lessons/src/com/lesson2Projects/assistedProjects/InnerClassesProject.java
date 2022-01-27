package com.lesson2.assistedProjects;

public class InnerClasses 
{
 private String msg="Welcome to Java"; 
	 
	 class Inner
	 {  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  
	 
	 private String msgs="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  


	public static void main(String[] args) 
	{
		InnerClasses obj=new InnerClasses();
		InnerClasses.Inner in=obj.new Inner();  
		in.hello(); 
		
		InnerClasses  ob=new InnerClasses ();  
		ob.display();  
		
		AnonymousInnerClass i = new AnonymousInnerClass() 
		{

	         public void display() 
	         {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();

		}

}

//anonymous inner class
abstract class AnonymousInnerClass 
{
	public abstract void display();
}

