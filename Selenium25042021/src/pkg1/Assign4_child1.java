package pkg1;

public class Assign4_child1 extends Assign4_Parent
{
	public Assign4_child1()
	{
		this(6,9,7,6);
		System.out.println("child default construtcor");
	}
	public Assign4_child1(int a) 
	{
		this(6,8,9);
		System.out.println("child 1 parametrized constructor");
	}
	public Assign4_child1(int a,int b) 
	{
		this();
		System.out.println("child 2 parametrized constructor");
	}
	public Assign4_child1(int a,int b,int c) 
	{
		this(8,6);
		System.out.println("child 3 parametrized constructor");
	}
	public Assign4_child1(int a,int b,int c,int d) 
	{
		super(7,5,7,8);
		System.out.println("child 4 parametrized constructor");
	}
	public static void main(String[] args) 
	{
		Assign4_child1 a1=new Assign4_child1(1);
	}

}
