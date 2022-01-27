package com.lesson2.assistedProjects;

public class SingleAndMultiDimentionalArrays 
{

	public static void main(String[] args) 
	{
		//single-dimensional array
		int a[]= {10,20,30,40,50};
		for(int index=0;index<5;index++) 
		{
		System.out.println("Elements of array a: "+a[index]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9}
		            };
		      
		System.out.println("\nLength of row 1: " + b[0].length);

	}

}
