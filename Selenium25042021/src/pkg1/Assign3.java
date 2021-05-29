package pkg1;
public class Assign3 //((((10-2)+2)*2)-2)/2)
{
	public int sub(int s1,int s2)
	{
		int s3=s1-s2;
		System.out.println("Sub reult is "+s3);
		return s3;
	}
	public int sum(int s4,int s5) 
	{
		int s6=s4+s5;
		System.out.println("sum reult is "+s6);
		return s6;
	}
	public int mul(int m1,int m2) 
	{
		int m3=m1*m2;
		System.out.println("mul reult is "+m3);
		return m3;
	}
	public void divide(int d1,int d2) 
	{
		int d3=d1/d2;
		System.out.println("Divide reult is "+d3);
		System.out.println("The result of ((((10-2)+2)*2)-2)/2) = "+d3);

	}
	public static void main(String[] args) 
	{
		Assign3 a3=new Assign3();
		int subR=a3.sub(10, 2);
		int sumR=a3.sum(subR, 2);
		int mulR=a3.mul(sumR, 2);
		int subR2=a3.sub(mulR, 2);
		a3.divide(subR2, 2);
	}
}
