package pkg1;

public class Assign4_Parent_method 
{
	public void Assign4_Parent_method0() 
	{
		this.Assign4_Parent_method3(7,5,6);
		System.out.println("parent default method");
	}
	public void Assign4_Parent_method1(int a) 
	{
		this.Assign4_Parent_method0();
		System.out.println("parent 1 parametrized method");
	}
	public void Assign4_Parent_method2(int a,int b) 
	{
		this.Assign4_Parent_method1(7);
		System.out.println("parent 2 parametrized method");
	}
	public void Assign4_Parent_method3(int a,int b,int c) 
	{
		System.out.println("parent 3 parametrized method");
	}
	public void Assign4_Parent_method4(int a,int b,int c,int d) 
	{
		this.Assign4_Parent_method2(8,7);
		System.out.println("parent 4 parametrized method");
	}	

}
