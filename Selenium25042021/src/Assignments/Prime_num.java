package Assignments;
import java.util.Scanner;

public class Prime_num 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num=s.nextInt();
		int count=0;
		if(num==1 || num==0)
		{
			System.out.println("Its not a prime");
		}
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime");
		}
	}

}
