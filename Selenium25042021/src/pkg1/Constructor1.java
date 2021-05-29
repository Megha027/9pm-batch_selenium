package pkg1;
public class Constructor1 
{
	public Constructor1() 
	{
		this(1,9,8);
		System.out.println("Default constructor");
	}
	
	public Constructor1(int a) 
	{
		this();
		System.out.println("One parameterized constructor");
	}
	
	public Constructor1(int a,int b) 
	{
		this(1);
		System.out.println("Two parameterized constructor");
	}
	
	public Constructor1(int a,int b, int c) 
	{
		System.out.println("Three parameterized constructor");	
	}
	
	public Constructor1(int a,int b,int c,int d) 
	{
		this(2,3);
		System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
  		Constructor1 c=new Constructor1(1,3,9,7);
	}
}
