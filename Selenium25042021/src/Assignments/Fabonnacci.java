package Assignments;
import java.util.Scanner;

public class Fabonnacci {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number upto u want fabonnaci series ");
		int num=s.nextInt();
		 int n1=0;
		 int n2=1;
		 int n3;
		 System.out.println(n1+" ");
		 System.out.println(n2+ " ");
		 
		 for(int i=1 ;i<num;i++)
		 {
			 n3=n1+n2;
			 System.out.println(n3+ " ");
			 n1=n2;
			 n2=n3;
		 }
}
}