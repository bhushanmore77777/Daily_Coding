import java.util.Scanner;
import java.util.Stack;

public class ParenthesisBalancing5 {
	public static boolean balancedParenthesis(String inputStr)
	{
		Stack stack=new Stack();
		char[] charArray=inputStr.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			char current=charArray[i];
			if(current=='{' || current=='(' || current=='[')
			{
				stack.push(current);
				continue;
			}
			if(stack.isEmpty())
			{
				return false;
			}
			char popChar;
			switch(current)
			{
			case'}':
				popChar=(char)stack.pop();
				if(popChar==')' || popChar==']')
					return false;
				    break;
			case')':
				popChar=(char)stack.pop();
				if(popChar=='{'||popChar=='[')
					return false;
				    break;
			case']':
				popChar=(char)stack.pop();
				if(popChar=='('||popChar=='{')
					return false;
				    break;
			}
		}
		return (stack.isEmpty());
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String inputStr=sc.nextLine();
	if(balancedParenthesis(inputStr))
	{
		System.out.println("Balanced");
	}
	else
	{
		System.out.println("Not Balanced");
	}
}
}
