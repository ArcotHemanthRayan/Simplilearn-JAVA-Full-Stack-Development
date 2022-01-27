import java.util.ArrayList;
import java.util.Iterator;

public class LongestIncreasingSubSequence 
{
	public static void main(String[] args) 
	{
		 int array[] = {10, 20, 30, 40, 9, 6, 60, 4, 2 ,9};
	     ArrayList list = new ArrayList();
	     ArrayList list1 = new ArrayList();
	     int max;
	     int count = 0;
	     for(int index = 0; index < array.length; index++)
	        {
	    	    max = Integer.MIN_VALUE;
	            for(int inloop = index; inloop < array.length; inloop++)
	            {
	                if(array[inloop] > max)
	                {
	                    list.add(array[inloop]);
	                    max = array[inloop];
	                }
	            }
	             
	            //Compares previous highest subsequence
	            if(count < list.size())
	            {
	            	count = list.size();
	                list1 = new ArrayList(list); 
	            }  
	            list.clear();
	        }
	        System.out.println();
	         
	        //Printing list
	        Iterator itr = list1.iterator();
	        System.out.print("The Longest subsequence is = ");
	        while(itr.hasNext())
	        {
	            System.out.print(itr.next() + ", ");
	        }
	        System.out.println();
	        System.out.println("Length of Longest Increasing Subsequence is = " + count);
	}

}
