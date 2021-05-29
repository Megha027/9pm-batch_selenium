package pkg1;

public class Assign4_Child_method extends Assign4_Parent_method

{
	public void Assign4_Child_method0()
	{
		this.Assign4_Child_method4(6,9,7,6);
		System.out.println("child default method");
	}
	public void Assign4_Child_method1(int a) 
	{
		this.Assign4_Child_method3(6,8,9);
		System.out.println("child 1 parametrized method");
	}
	public void Assign4_Child_method2(int a,int b) 
	{
		this.Assign4_Child_method0();
		System.out.println("child 2 parametrized method");
	}
	public void Assign4_Child_method3(int a,int b,int c) 
	{
		this.Assign4_Child_method2(8,6);
		System.out.println("child 3 parametrized method");
	}
	public void Assign4_Child_method4(int a,int b,int c,int d) 
	{
		super.Assign4_Parent_method4(7,5,7,8);
		System.out.println("child 4 parametrized method");
	}
	public static void main(String[] args) 
	{
		Assign4_Child_method a1=new Assign4_Child_method();
		a1.Assign4_Child_method1(3);
	}
}
