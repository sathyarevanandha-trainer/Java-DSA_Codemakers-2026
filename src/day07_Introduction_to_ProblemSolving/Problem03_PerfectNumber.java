package day07_Introduction_to_ProblemSolving;

import java.util.Scanner;

public class Problem03_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans;

        //ans=factors_sum_approach1(n);

        ans=factors_sum_approach2(n);

        if(n==ans)
            System.out.println("True");
        else
            System.out.println("False");
    }

    //Bruteforce

    static int factors_sum_approach1(int n)
    {
        int i,sum=0;

        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }

        return sum;
    }

    //Optimization

    static int factors_sum_approach2(int n)
    {
        int i,sum=1;

        for(i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i==n/i)
                    sum=sum+i;
                else
                    sum=sum+i+n/i;
            }
        }

        return sum;
    }


}
