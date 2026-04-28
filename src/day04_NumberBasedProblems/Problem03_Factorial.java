package day04_NumberBasedProblems;

import java.util.Scanner;

public class Problem03_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int fact=1,i;

        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
