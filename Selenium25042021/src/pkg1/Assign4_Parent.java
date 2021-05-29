package pkg1;

public class Assign4_Parent 
{
	public Assign4_Parent() 
	{
		this(7,5,7);
		System.out.println("parent default constructor");
	}
	public Assign4_Parent(int a) 
	{
		this();
		System.out.println("parent 1 parametrized constructor");
	}
	public Assign4_Parent(int a,int b) 
	{
		this(6);
		System.out.println("parent 2 parametrized constructor");
	}
	public Assign4_Parent(int a,int b,int c) 
	{
		System.out.println("parent 3 parametrized constructor");
	}
	public Assign4_Parent(int a,int b,int c,int d) 
	{
		this(8,9);
		System.out.println("parent 4 parametrized constructor");
	}	
}
