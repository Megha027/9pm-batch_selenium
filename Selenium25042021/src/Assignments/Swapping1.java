package Assignments;
import java.util.*;
public class Swapping1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number a= ");
		int a=s.nextInt();
		System.out.println("Enter first number b= ");
		int b=s.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping Value of a is "+ +a +"  and b is "+b);
	}
}
