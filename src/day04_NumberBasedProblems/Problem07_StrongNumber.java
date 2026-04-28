package day04_NumberBasedProblems;

import java.util.Scanner;

public class Problem07_StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int rem,sum=0,fact,i;

        int temp=n;

        while(n>0)
        {
            rem=n%10;
            fact=1;
            for(i=rem;i>=1;i--)
            {
                fact=fact*i;
            }

            sum=sum+fact;
            n=n/10;
        }

        n=temp;

        if(n==sum)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
