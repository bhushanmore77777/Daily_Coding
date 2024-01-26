import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2= sc.nextInt();
        System.out.println("Enter Symbol");
        String sym=sc.next();
        int res;
        switch (sym){
            case "+":res=num1+num2;
                System.out.println("Addition is"+res);
                break;
            case"-":res=num1-num2;
                System.out.println("Substraction is"+res);
                break;
            case"*":res=num1*num2;
                System.out.println("Multiplication is"+res);
                break;
            case "/":res=num1/num2;
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid Symbol!");
        }
    }
    }

