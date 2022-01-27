package com.lesson3.assistedProjects;

public class ThreadCreation1 extends Thread
{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
  	}

	public static void main(String[] args) 
	{
		ThreadCreation1 t = new  ThreadCreation1();
  		t.start();
	}

}
