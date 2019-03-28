package patterns;

public class BThreads {
	
	String ch = " B"; 
 	synchronized void happy() throws InterruptedException{
		
		//comment 
		for(int i=1; i<=34; i++) 
		{ 
		
			if (i==5||i==8||i==12|| 
				i==13||i==17||i==18|| 
				i==19||i==22||i==23|| 
				i==24||i==27||i==31) 
			{
			System.out.print(ch);
			Thread.sleep(300);
			}else {
				System.out.print("  ");
			}
			}
		//Thread.sleep(1000);

		System.out.println(); 
		for(int i=1; i<=34; i++) 
		{ 
			if(i==5||i==8||i==11||i==14||i==17||i==19
					||i==22||i==24||i==28||i==30){ 
				System.out.print(ch); 
				Thread.sleep(300);
			}
			else System.out.print("  "); 

		} 
		//Thread.sleep(1000);
		System.out.println(); 
		
		
		
		for (int i=1; i<=34; i++) 
		{ 
			if (i==5||i==6||i==7||i==8||  
				i==11||i==12||i==13|| 
				i==14||i==17||i==18|| 
				i==19||i==22||i==23||
				i==24||i==29 ) {
				System.out.print(ch) ; 
				Thread.sleep(300);
			}
			else System.out.print("  "); 

		} 
		//Thread.sleep(1000);
		System.out.println(); 
		
		
		
		for (int i=1; i<=34; i++) 
		{ 
			if (i==5||i==8||i==11||i==14|| 
				i==17||i==22||i==29) {
				System.out.print(ch); 
				Thread.sleep(300);
			}
			else System.out.print("  "); 

		} 
		//Thread.sleep(1000);
		System.out.println(); 

		
		
		for (int i=1; i<=34; i++) 
		{ 
			if (i==5||i==8||i==11||i==14|| 
					i==17||i==22||i==29) {
					System.out.print(ch);
					Thread.sleep(300);
			} 
			else System.out.print("  "); 

		} 
		//Thread.sleep(1000);
		 
		 
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
	}
	
	
	synchronized void birthday() throws InterruptedException{
		for (int i=1; i<=49; i++) 
		{ 
			if (i==1||i==2||i==3|| 
				i==7||i==8||i==9||
				i==12||i==13||i==14||
				i==18||i==19||i==20|| 
				i==23||i==26||i==29|| 
				i==30||i==31||i==36||
				i==37||i==41||i==45) {
				System.out.print(ch); 
				//Thread.sleep(50);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		
		
		for(int i=1; i<=49; i++) 
		{ 
			if (i==1||i==4|| i==8||
				i==12||i==15||i==19|| 
				i==23||i==26||i==29|| 
				i==32||i==35||
				i==38||i==42||i==44) {
				System.out.print(ch); 
				//Thread.sleep(50);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==1||i==2||i==3|| 
				i==8||
				i==12||i==13||i==14||
				i==19||i==23||i==24||
				i==25||i==26||i==29|| 
				i==32||i==35||i==36||
				i==37||i==38||i==43){ 
				System.out.print(ch); 
			//Thread.sleep(50);
		}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==1||i==4||i==8||
				i==12||i==15||i==19|| 
				i==23||i==26||i==29|| 
				i==32||i==35||
				i==38||i==43) {
				System.out.print(ch); 
			//	Thread.sleep(50);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		
		
		
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==1||i==2||i==3|| 
				i==7||i==8||i==9||
				i==12||i==15||i==19||
				i==23||i==26||i==29|| 
				i==30||i==31||i==35||
				i==38||i==43) {
				System.out.print(ch);
				//Thread.sleep(50);
			} 
			else System.out.print("  "); 
		} 
		
	
		Thread.sleep(1500);
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		
		
	}
	
	
	
	synchronized void bhagya() throws InterruptedException{
		for (int i=1; i<=49; i++) 
		{ 
			if (i==4||i==5|| 
				i==6||i==10||i==13|| 
				i==17||i==18||i==23|| 
				i==24||i==25||i==28|| 
				i==32||i==36||i==37){ 
				System.out.print(ch);
				Thread.sleep(300);
			}
			else System.out.print("  "); 
		} 

		//Thread.sleep(1500);
		System.out.println(); 
	
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==4||i==7||i==10||
				i==13||i==16||i==19||
				i==22||i==29||i==31||
				i==35||i==38) {
				System.out.print(ch); 
				Thread.sleep(300);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==4||i==5||i==6||
				i==10||i==11||i==12||
				i==13||i==16||i==17||
				i==18||i==19||i==22||
				i==24||i==25||i==30|| 
				i==35||i==36||i==37||
				i==38) {
				System.out.print(ch); 
				Thread.sleep(300);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==4||i==7||i==10||
				i==13||i==16||i==19||
				i==22||i==25||i==30||
				i==35||i==38) {
				System.out.print(ch);
				Thread.sleep(300);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		System.out.println(); 
		
		
		
		for (int i=1; i<=49; i++) 
		{ 
			if (i==4||i==5||i==6||
				i==10||i==13||i==16||
				i==19||i==23||i==24||
				i==30||i==35||i==38) {
				System.out.print(ch); 
				Thread.sleep(300);
			}
			else System.out.print("  "); 
		} 
		Thread.sleep(1500);
		
		System.out.println(); 
		System.out.println(); 
		System.out.println();
	}
	
	
	synchronized void heart() throws InterruptedException{
		int n=13;
		for (int i = 1; i <6; i++) {
			for (int j = 0; j <10; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=n ; j++) {
				if((i==1&&(j==1||j==2||j==5||j==6||j==7||j==8||j==9||j==12||j==13))||(i==2&&(j==1||j==6||j==7||j==8||j==13))||(i==3&&j==7)){
				System.out.print("  ");
				}else{
					if (i==1||i==2) {
						System.out.print(" B");
					}
					else if (i==3||i==4) {
						System.out.print(" H");
					} else{
						System.out.print(" A");
					}
				
				Thread.sleep(300);
				}
			}
			//Thread.sleep(2000);
			System.out.println();
		}
		for (int i = 1; i <=7; i++) {
			n=n-2;
			for (int j = 0; j <10; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i ; j++) {
			System.out.print("  ");
			}
			for (int j = 1; j <=n; j++) {
				if (i==1||i==2) {
					System.out.print(" G");
				}else if (i==3||i==4) {
					System.out.print(" Y");
				} else{
					System.out.print(" A");
				}

				
				
			}
			Thread.sleep(1500);
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}
}
