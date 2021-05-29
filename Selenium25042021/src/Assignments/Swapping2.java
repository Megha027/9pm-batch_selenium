package Assignments;
import java.util.Scanner;

public class Swapping2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number a= ");
		int a=s.nextInt();
		System.out.println("Enter first number b= ");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping Value of a is "+ +a +"  and b is "+b);
	}
}
