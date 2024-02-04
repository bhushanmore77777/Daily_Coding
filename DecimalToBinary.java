import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int temp=num;
	String b="";
	while(temp!=0)
	{
		int rem=temp%2;
		temp=temp/2;
		b=rem+b;
	}
	System.out.println("Binary Number"+b);
}
}
