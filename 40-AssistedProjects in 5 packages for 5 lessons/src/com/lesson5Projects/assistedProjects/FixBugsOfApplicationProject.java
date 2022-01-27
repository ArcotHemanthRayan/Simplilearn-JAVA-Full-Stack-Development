package com.lesson5.assistedProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixBugsOfApplication 
{
	public static void main(String[] args) 
	{
	     options();

	    }
	    private static void options() {
	        String[] arr = {"\n1. Check details",
	                "2. Add details",
	                "3. Delete details",
	                "4. Sort the details",
	                "5. Search for details in ascending order",
	                "6. Close the application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  stringlength = arr1.length;
	        for(int index=0; index<stringlength;index++)
	        {
	            System.out.println(arr[index]);
	        }
	        ArrayList<Integer> arraylist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        //adding the details
	        expenses.add(1);
	        expenses.add(2);
	        expenses.add(6);
	        expenses.add(9);
	        expenses.add(5);
	        expenses.addAll(arraylist);
	        System.out.println("\nEnter your option:\t");
	        Scanner scan = new Scanner(System.in);
	        int  options =  scan.nextInt();
	        for(int index=1;index<=stringlength;index++)
	        {
	            if(options==index)
	            {
	                switch (options)
	                {
	                    case 1:
	                        System.out.println("The Details In the list are: \n");
	                        System.out.println(expenses+"\n");
	                        options();
	                        break;
	                    case 2:
	                        System.out.println("Enter the values to add list: \n");
	                        int value = scan.nextInt();
	                        expenses.add(value);
	                        System.out.println("value are updated\n");
	                        expenses.addAll(arraylist);
	                        System.out.println(expenses+"\n");
	                        options();

	                        break;
	                    case 3:
	                        if(options==options)
	                        {
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All details are deleted\n");
	                            break;
	                        } 
	                        else 
	                        {
	                            System.out.println("try again");
	                        }
	                        options();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        options();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        options();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("Please select correct option");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() 
	    {
	        System.out.println("Appliction Closed");
	    }
	    private static void searchExpenses(ArrayList<Integer> arrayList) 
	    {
	        int length = arrayList.size();
	        System.out.println("Enter the details you need to search\t");
	        // searching details
	        Scanner scan = new Scanner(System.in);
	        int input = scan.nextInt();
	        //Linear Search
	        for(int index=0;index<length;index++) 
	        {
	        	if(arrayList.get(index)==input) 
	        	{
	        		System.out.println("the details are " + input + " at " + index + " position");
	        	}
	        }
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) 
	    {
	        int arraylength =  arrayList.size();
	        // sorting the details
	        Collections.sort(arrayList);
	        System.out.println("Sorted details are : ");
	        for(Integer i: arrayList) 
	        {
	        	System.out.print(i + ", ");
	        }
	        	       
	    }
}
