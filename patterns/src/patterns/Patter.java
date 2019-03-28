package patterns;

public class Patter {

	public static void main(String[] args) {
	int a=0;
		
		for(int i=1; i<=4;i++)
		{
		for(int j=1;j<a;j++)
		{
			System.out.print(" ");
		}
		for(int k=4;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
		a++;
		}
	}

}
