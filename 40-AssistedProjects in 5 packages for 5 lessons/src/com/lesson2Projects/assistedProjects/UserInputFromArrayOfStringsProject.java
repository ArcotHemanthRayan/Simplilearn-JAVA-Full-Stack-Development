package com.lesson2.assistedProjects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputFromArrayOfStrings 
{
	
	private static final String regex = "^(.+)@(.+)$";

	public static void main(String[] args) 
	{
		List<String> emails = new ArrayList<String>();
	       
	       // valid email addresses
	       emails.add("abc@example.com");
	       emails.add("your.hello@example.com.in");
	       emails.add("any#@example.me.org");
	       
	       
	       //invalid email addresses
	       
	       emails.add("abc.example.com");
	       emails.add("new#example.com");
	       emails.add("@some.me.org");
	       

	       //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);

	       //searching for occurrences of regex
	       for (String email : emails) 
	       {
	           Matcher matcher = pattern.matcher(email);

	           System.out.println("The Email address " + email + " is " 
	                                  + (matcher.matches() ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter an email address to verify");
	       Scanner scan=new Scanner(System.in);
	       
	       // Taking input from user
	       String email=scan.nextLine();
	       Matcher match=pattern.matcher(email);
	       System.out.println("The Email address " + email + " is " 
                + (match.matches() ? "valid" : "invalid"));
	}

}
