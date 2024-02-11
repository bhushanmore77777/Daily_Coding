import java.util.Scanner;

public class OctalToDecimal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	int i=0;
	while(temp!=0)
	{
		int rem=temp%10;
		sum+=rem*Math.pow(8,i++);
		temp=temp/10;
	}
	System.out.println("Decimal Number"+sum);
}
}
