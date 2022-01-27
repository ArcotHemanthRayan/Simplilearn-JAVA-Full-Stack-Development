package com.lesson3.assistedProjects;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}

public class ResolvingDimondProblem implements First, Second
{
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	ResolvingDimondProblem ob = new ResolvingDimondProblem(); 
        ob.show(); 
    } 

}
