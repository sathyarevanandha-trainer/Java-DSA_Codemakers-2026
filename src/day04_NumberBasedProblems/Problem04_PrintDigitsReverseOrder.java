package day04_NumberBasedProblems;

import java.util.Scanner;

public class Problem04_PrintDigitsReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int rem;

        while(n>0)
        {
            rem=n%10;
            System.out.print(rem);
            n=n/10;

        }
    }
}
