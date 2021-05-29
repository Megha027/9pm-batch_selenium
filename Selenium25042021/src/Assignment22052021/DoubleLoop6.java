package Assignment22052021;

public class DoubleLoop6 
{
	public static void main(String[] args) 
	{
		int k=5;
		for(int i=1;i<=9;i=i+2)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print(" ");
			}
			k--;
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
