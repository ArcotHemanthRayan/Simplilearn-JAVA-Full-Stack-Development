import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{

		String operator;
		double firstNumber, secondNumber, result;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter + operator to add two numbers");
		System.out.println("Enter - operator to substract two numbers");
		System.out.println("Enter * operator to add multiply two numbers");
		System.out.println("Enter / operator to add divide two numbers");
		
		operator=scan.nextLine();
		System.out.println("Enter First Number");
		firstNumber=scan.nextDouble();
		System.out.println("Enter Second Number");
		secondNumber=scan.nextDouble();
		
		switch(operator)
		{
		
		case "+":
			result=firstNumber+secondNumber;
			System.out.println("Adition of two numbers is= "+result);
			break;
			
		case "-":
			result=firstNumber-secondNumber;
			System.out.println("Substraction of two numbers is= "+result);
			break;
			
		case "*":
			result=firstNumber*secondNumber;
			System.out.println("Multiplication of two numbers is= "+result);
			break;
			
		case "/":
			result=firstNumber/secondNumber;
			System.out.println("Division of two numbers is= "+result);
			break;
			
		default:
			System.out.println("Invalid Operator !!!!!, Please enter a valid operator");
			break;
			
		}
		
	}
}
