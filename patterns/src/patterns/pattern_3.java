package patterns;

public class pattern_3 {

	public static void main(String[] args) {
		String str="allah";
		int count=0;
		for(char a='A';a<='z';a++)
		{
			count=0;
			char k=a;
			for(int i=0;i<str.length();i++)
				{
					if(k==str.charAt(i))
					{
						count=count+1;
					}
				}
			if(count>0)
			{
				System.out.println(a+":"+count);

			}
		}
	}

}
