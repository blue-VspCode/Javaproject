package Patterns;

public class NumberWithPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=5,count=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println(" ");
			
		}
		System.out.println();

	}
	
}