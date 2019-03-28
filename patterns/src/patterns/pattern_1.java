package patterns;

public class pattern_1 {
	
	public static void main(String[] args){
		int no=1;
		for(int i=1; i<=4; i++){
			for(int j=3; j>=1; j--){
				System.out.print(" "); 
			}
			for(int j=no; j>=1; j++){
	         System.out.print(j);
			}	
			no++;
			System.out.println();
	 }
	
	}}
	
