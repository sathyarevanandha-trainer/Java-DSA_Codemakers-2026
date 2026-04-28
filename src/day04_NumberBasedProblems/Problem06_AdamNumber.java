package day04_NumberBasedProblems;

import java.util.Scanner;

public class Problem06_AdamNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int rem,rev=0;

        int s1=n*n;

        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        int s2=rev*rev;

        rev=0;
        while(s2>0)
        {
            rem=s2%10;
            rev=rev*10+rem;
            s2=s2/10;

        }

        if(s1==rev)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
