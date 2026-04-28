package day04_NumberBasedProblems;

import java.util.Scanner;

public class Problem08_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int temp=n;

        int c=0;

        while(n>0)
        {
            n=n/10;
            c++;
        }

        n=temp;

        int rem,sum=0;

        while(n>0)
        {
            rem=n%10;

            sum=sum+(int)Math.pow(rem,c);

            n=n/10;
        }

        n=temp;

        if(n==sum)
            System.out.println("True");
        else
            System.out.println("False");


    }
}
