package day06_NumberBasedProblemsUsingMethods;

import java.util.Scanner;

public class Problem05_FibonacciNumber {
    public static void main(String[] args) {

        //----Leetcode Problem----

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans=fibonacci(n);

        System.out.println(ans);
    }

    static int fibonacci(int n)
    {
        int a=0,b=1,next=0;

        int count=2;

        while(count<=n)
        {
            next=a+b;
            a=b;
            b=next;
            count++;
        }

        return next;
    }


}
