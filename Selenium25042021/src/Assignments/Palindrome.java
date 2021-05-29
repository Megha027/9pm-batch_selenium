package Assignments;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num=s.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		
		while(num>0) 
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
	}
}
