package com.lesson3.assistedProjects;
import java.io.*;
import java.util.*; 

public class MultiThreadingSynchronization 
{
	public void send(String messg) 
    { 
        System.out.println("Sending\t"  + messg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + messg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String messg; 
    private Thread t; 
    MultiThreadingSynchronization  ms; 
    ThreadedSend(String m,  MultiThreadingSynchronization obj) 
    { 
        messg = m; 
        ms = obj; 
    } 
  
    public void run() 
    {  
        synchronized(ms) 
        { 
            ms.send(messg); 
        } 
    } 
} 
class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
    	MultiThreadingSynchronization snd = new MultiThreadingSynchronization(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Hi " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    }

}
