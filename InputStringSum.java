import java.util.Scanner;

public class InputStringSum {
	static int sumOfString(String x)
	{
		int sum=0;
		for(int i=0;i<x.length();i++)
		{
			sum=sum+x.charAt(i)-48;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String x=sc.nextLine();
	System.out.println(sumOfString(x));
}
}
