package patterns;

public class Pattern2 {

	public static void main(String[] args) {
	
		int st=6,spc=0,sp=0;
		for(int i=1;i<=6;i++)
		{
			char c='A';
			sp=i-1;
			for(int j=1;j<=spc;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print((char)(c+sp));
				sp++;
			}
			System.out.println();
			c++;
			spc++;
			st--;	
		}
	}
}
