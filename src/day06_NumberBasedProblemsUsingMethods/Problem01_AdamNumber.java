package day06_NumberBasedProblemsUsingMethods;

import java.util.Scanner;

public class Problem01_AdamNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int s1=square(n);

        int r1=reverse(n);

        int s2=square(r1);

        int r2=reverse(s2);

        if(s1==r2)
            System.out.println("True");
        else
            System.out.println("False");
    }


    static int square(int n)
    {
        return n*n;
    }

    static int reverse(int n)
    {
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
