package String;

public class Demo3 {

	public static void main(String[] args) {
		String a=" ABCD";
		String b="";
		for(int i=0;i<=a.length()-1;i++)
		{
			char c=a.charAt(i);
			b=b+c;
			for(int j=0;j<=b.length()-1;j++) 
			{
				System.out.print(c);	
			}
		

	}

	}
}