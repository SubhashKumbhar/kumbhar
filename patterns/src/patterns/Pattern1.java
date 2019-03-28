package patterns;

public class Pattern1 {
	public static void main(String[] args) {
		
		int star=1;
		int space=2;
		for(int i=1;i<=3;i++)
		{
			int print=1;
			for(int j=space;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(print);
				if(k<=star/2) 
				{
					print++;
				} 
				else 
				{
					print--;
				}
			}
			star+=2;
			space--;
			System.out.println();
		}
	}

}
