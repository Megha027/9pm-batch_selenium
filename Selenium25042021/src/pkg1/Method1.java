package pkg1;
//Calling method using this keyword
public class Method1 
{
	public void m() 
	{
		this.m4(4, 7, 7, 7);
		System.out.println("Default method/No parameter");
	}
	public void m1(int a) 
	{
		this.m();
		System.out.println("One parameterized method");
	}

	public void m2(int a,int b) 
	{
		this.m1(5);
		System.out.println("two parameterized method");
	}
	public void m3(int a,int b, int c) 
	{
		this.m2(9, 6);
		System.out.println("three parameterized method");
	}
	public void m4(int a,int b, int c,int d) 
	{
		System.out.println("four parameterized method");
	}
	public static void main(String[] args)
	{
		Method1 obj=new Method1();
		obj.m3(5,6,7);
	}
}
