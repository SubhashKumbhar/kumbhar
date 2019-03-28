import java.util.Scanner;

public class Interview_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		///
		//char a;
		for(int i=0;i<c.length-1;i++)
		{
			int count=1;
			//a=c[i];
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]= '0';
					count++;
				}
			}
			
			if(c[i]!='0'){
				System.out.println();
			System.out.println(c[i]+" is repeated "+count);
			}
		}
		
	}
}
