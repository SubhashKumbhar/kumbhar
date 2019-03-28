
public class PatternPrime {

	public static void main(String[] args) {
		int [] ar=new int[60];
		int point=0;
		for (int i = 2; i <=100; i++) {
			int count=0;
			for (int j = 2; j <=i/2; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				ar[point]=i;
				point++;
			}
		}
		
		
		
		
		int c=0;
		for (int i = 5; i >0; i--) {
			for (int j =0; j <5-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <i; j++) {
				System.out.print(ar[c]+" ");
				c++;
			}
			System.out.println();
			c-=1;
		}
	}

}
