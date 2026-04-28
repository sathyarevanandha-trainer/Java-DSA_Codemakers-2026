package day06_NumberBasedProblemsUsingMethods;

import java.util.Scanner;

public class Problem02_StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int rem,sum=0;

        int temp=n;

        while(n>0)
        {
            rem=n%10;
            sum=sum+factorial(rem);
            n=n/10;
        }

        n=temp;

        if(n==sum)
            System.out.println("True");
        else
            System.out.println("False");
    }

    static int factorial(int rem)
    {
        int fact=1,i;

        for(i=rem;i>=1;i--)
        {
            fact=fact*i;
        }

        return fact;
    }
}
