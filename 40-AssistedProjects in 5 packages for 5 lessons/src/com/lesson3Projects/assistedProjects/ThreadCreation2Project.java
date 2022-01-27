package com.lesson3.assistedProjects;

public class ThreadCreation2 implements Runnable
{
	public static int myCount = 0;
    public ThreadCreation2()
    {     
    }
    public void run() 
    {
        while(ThreadCreation2.myCount <= 10)
        {
            try
            {
                System.out.println("Expl Thread: "+(++ThreadCreation2.myCount));
                Thread.sleep(100);
            } 
            catch (InterruptedException iex) 
            {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String []args)
    {
        System.out.println("Starting Main Thread...");
        ThreadCreation2 mrt = new ThreadCreation2();
        Thread t = new Thread(mrt);
        t.start();
        while(ThreadCreation2.myCount <= 10)
        {
            try
            {
                System.out.println("Main Thread: "+(++ThreadCreation2.myCount));
                Thread.sleep(100);
            } 
            catch (InterruptedException iex)
            {
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

}
