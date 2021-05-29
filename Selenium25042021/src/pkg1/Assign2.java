package pkg1;
public class Assign2 			//((((10+2)+2)-2)*2)/2)
{
	public int sum(int s1,int s2)		//non void method=will get return result
	{
		int s0=s1+s2;
		System.out.println("sum result is "+s0);
		return s0;	
	}
	public int sub(int s3,int s4 ) 		//non void method=will get return result
	{
		int s5=s3-s4;
		System.out.println("sub result is "+s5);
		return s5;
	}
	public int mul(int m1,int m2)  		//non void method=will get return result
	{
		int m3=m1*m2;
		System.out.println("mul result is "+m3);
		return m3;
	}
	public void divide(int d1,int d2)  		//void method=will not get return result
	{
		int d3=d1/d2;
		System.out.println("divide result is "+d3);
		System.out.println("The result of ((((10+2)+2)-2)*2)/2) = "+d3);
	}
	public static void main(String[] args) {
		Assign2 a2=new Assign2();  //object creation
		int sumR=a2.sum(10, 2);		//calling sum method
		int sumR2=a2.sum(sumR, 2);	//calling sum  again
		int subR=a2.sub(sumR2, 2);	//calling sub method
		int mulR=a2.mul(subR, 2);	//calling mul method
		a2.divide(mulR, 2);			//calling divide method			
	}
}
