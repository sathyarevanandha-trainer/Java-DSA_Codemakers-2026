package day04_NumberBasedProblems;

import java.util.Scanner;

public class Problem02_SumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int sum=0,rem;

        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;

        }
        System.out.println(sum);
    }
}
