package pkg1;

import java.util.Scanner;

public class UserInput2_15_05 
{
	public int sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Summation is "+sum);
		return sum;
	}
	public int sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtraction is "+sub);
		return sub;
	}
	public int mul(int a, int b)
	{
		int mul=a*b;
		System.out.println("Multiplication is "+mul);
		return mul;
	}
	public void div(int a, int b)
	{
		int div=a/b;
		System.out.println("Division is "+div);
		System.out.println("Final result is ((((x1+x2)-x3)+x4)*x5)/x6) :"+div);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x1 value: ");
		int x1=s.nextInt();
		System.out.println("Enter x2 value: ");
		int x2=s.nextInt();
		System.out.println("Enter x3 value: ");
		int x3=s.nextInt();
		System.out.println("Enter x4 value: ");
		int x4=s.nextInt();
		System.out.println("Enter x5 value: ");
		int x5=s.nextInt();
		System.out.println("Enter x6 value: ");
		int x6=s.nextInt();
	
		Userinput15_05 u=new Userinput15_05(); 
		int mulR=u.mul(x1, x2);
		int subR=u.sub(mulR, x3);
		int sumR=u.sum(subR, x4);
		int sub2=u.sub(sumR, x5);
		u.div(sub2, x6);    //((((x1*x2)-x3)+x4)-x5)/x6)
	}

}
