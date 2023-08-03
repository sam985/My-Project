package java_project2;

import java.util.Scanner;

public class Calculator {

		public static int add(int number1, int number2)
		{ 
			return number1+number2;
		}
		public static int sub(int number1, int number2)
		{ 
			return number1-number2;
		}
		public static int mult(int number1, int number2)
		{ 
			return number1*number2;
		}
		public static double div(double number1, double number2)
		{ 
			if (number2==0)
			{
				throw new IllegalArgumentException("Division by zero is undefined");
			}
			return number1/number2;
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number:-");
			int input1 = sc.nextInt();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the second number:-");
			int input2 = sc.nextInt();
			sc.close();
			sc1.close();
			
			System.out.println("The Sum is : " + Calculator.add(input1, input2));
			System.out.println("The Difference is : " + Calculator.sub(input1, input2));
			System.out.println("The Product is : " + Calculator.mult(input1, input2));
			System.out.println("The Quotient is : " + Calculator.div(input1, input2));
			
		}
	}

