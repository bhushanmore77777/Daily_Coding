import java.util.Scanner;

public class DecimalToOctal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int temp=num;
	String o="";
	while(temp!=0)
	{
		int rem=temp%8;
		temp=temp/8;
		o=rem+o;
	}
	System.out.println("Octal Number"+o);
}
}
