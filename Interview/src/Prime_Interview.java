
public class Prime_Interview 
{
	public static void main(String[] args) 
	{
		int n=5;
		int num=1;
		for(int i=1;i<=5;i++)
		{
			int count;
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for (int k = 0; k <n ; k++) {
				count=0;
				for(int l=1;l<=num;l++)
				{
					
					if(num%l==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}
	}
}
