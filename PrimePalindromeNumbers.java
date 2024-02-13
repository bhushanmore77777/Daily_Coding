import java.util.Scanner;

public class PrimePalindromeNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int temp=num;
	int rem;
	int rev=0;
	int i;
	while(temp!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(rev==num)
	{
		for(i=2;i<=rev;i++)
		{
			if(rev%i==0)
			{
				System.out.println("Not Prime Palindrome");
				break;
			}
		}
		if(rev==i)
		{
			System.out.println(num+"Prime Palindrome Number");
		}
		System.out.println("Prime Palindrome Number");
	}
	else
	{
		System.out.println(num+"Prime Palindrome Number");
	}
}
}
