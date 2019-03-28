package patterns;

public class Pattern_B {

	public static void main(String[] args) {
		
		for(int i=1;i<=5 ;i++){
			for(int j=1;j<=4;j++){
				if(j<=3){
					if(i==1||i==5||j==1||j==5){
						System.out.print("*");
					}
					else if(i==3){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
					
				}else{
					if(i==2&&j==4||i==4&&j==4){
						System.out.print("*");
					}else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	} 

}
