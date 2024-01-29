import java.util.Scanner;
    class CompoundInterest{
        public static void main(String[] args){
            double principle,rate,time,compound_interest;
            Scanner sc=new Scanner(System.in);
            System.out.println("Principle");
            principle=sc.nextInt();
            System.out.println("Rate");
            rate=sc.nextInt();
            System.out.println("Time");
            time=sc.nextInt();
            compound_interest=(principle*(Math.pow((1+rate/100),time)-principle));

            System.out.println("Compound Interest is:"+compound_interest);

        }



    }

