package Assignments;

public class ABC 
{
	String name;
	String college;
	int marks;
	
	public void display() 
	{
		name="megha";
		college="MIET";
		marks=85;
		System.out.println("Name is "+name);
		System.out.println("Collge is "+college);
		System.out.println("Marks is "+marks);
	}
	public void display2(String name1,String college1,int marks1) 
	{
		name=name1;
		college=college1;
		marks=marks1;
		System.out.println("Name is "+name);
		System.out.println("Collge is "+college);
		System.out.println("Marks is "+marks);
	}
	public ABC()
	{
		
	}
	public ABC(String name1,String college1,int marks1) 
	{
		name=name1;
		college=college1;
		marks=marks1;
		System.out.println("Name is "+name);
		System.out.println("Collge is "+college);
		System.out.println("Marks is "+marks);
	}
	public static void main(String[] args) 
	{
		ABC a=new ABC();
		a.display();
		ABC b=new ABC();
		b.display2("Nilu","COEP",66);
		ABC c=new ABC("Ravi","PCCOE",69);
	}
}
