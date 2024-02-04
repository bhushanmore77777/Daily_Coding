import java.util.Scanner;

public class CountCharactersInString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String x=sc.nextLine();
	char y[]=x.toCharArray();
	for(int i=0;i<y.length;i++)
	{
		String s="";
		while(i<y.length && y[i]!=' ')
		{
			s=s+y[i];
			++i;
		}
		if(s.length()>0)
		{
			System.out.println(s+"---->"+s.length());
		}
	}
}
}
