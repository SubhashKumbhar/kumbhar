package patterns;

public class pattern_2 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
	     {
	         for(int j=i;j>=1;j--)
	         {
	             System.out.print(j);
	         } 
	         for (int l = 2; l <= i; l++)
	            {
	                System.out.print(l);
	            }
	         System.out.println("");
	     }
	}

}
