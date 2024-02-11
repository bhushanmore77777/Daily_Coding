import java.util.Scanner;

public class Pangram {
	static void containsAllLettersPresent(String string)
	{
		string=string.toLowerCase();
		boolean allLettersPresent=true;
		for(char ch='a';ch<='z';ch++)
		{
			if(!string.contains(String.valueOf(ch)))
			{
				allLettersPresent=false;
				break;
			}
		}
		if(allLettersPresent)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String string=sc.nextLine();
	containsAllLettersPresent(string);
}
}
