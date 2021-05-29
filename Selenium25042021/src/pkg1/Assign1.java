package pkg1;

public class Assign1 
{
	int rollNo=3;
	char gender='f';
	int age=24;
	
	public void Day1()
	{
		System.out.println("Welcome to java first class");
	}
	
	public void display() 
	{
		System.out.println("Its the first assignment");
		
	}
	
	public static void main(String[] args) 
	{
		Assign1 megh=new Assign1();
		megh.Day1();
		megh.display();
		System.out.println(megh.rollNo);
		System.out.println(megh.gender);
		System.out.println(megh.age);
		megh.age=35;
		System.out.println(megh.age);
	}

}
