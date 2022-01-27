package com.lesson3.assistedProjects;

public class KeywordsInJava 
{
	//throws ketword
	
	void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }

	public static void main(String[] args)
    {
		//throw keyword
		
        int a=45,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
        
        KeywordsInJava kw = new KeywordsInJava();
        try
       {
           kw.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\n\tError : " + Ex.getMessage());
       }
       System.out.print("\n\tEnd of program.");
       
       //finally block
       
       int a1=45,b1=0,rs1=0;
       try
       {
           rs1 = a1 / b1;
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\n\tError : " + Ex.getMessage());
       }
       finally // This block will execute definetly if exception occured on not
       {
           System.out.print("\n\tThe result is : " + rs1);
       }


    }

}
