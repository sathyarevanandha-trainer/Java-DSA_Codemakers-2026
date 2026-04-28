package day06_NumberBasedProblemsUsingMethods;

import java.util.Scanner;

public class Problem04_HarshadNumber {
    public static void main(String[] args) {

        //----Leetcode Problem----

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int sum=sum_of_digits(n);

        if(n%sum==0)
            System.out.println("True");
        else
            System.out.println("False");


    }

    static int sum_of_digits(int n) {
        int sum = 0, rem;

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sum;
    }
}
