package Assignments;
import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		num=num/10;
		sum=sum+(rem*rem*rem);
		}
		if(temp==sum)
		{
			System.out.println("armstrong number");
			
		}
		else
			System.out.println(" Not an armstrong number");
		}
}
