package day07_Introduction_to_ProblemSolving;

import java.util.Scanner;

public class Problem01_CountFactors {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans;

//        ans=countfactors_approach1(n);
//
//        System.out.println(ans);

        ans=countfactors_approach2(n);

        System.out.println(ans);


    }

    //Bruteforce

    static int countfactors_approach1(int n)
    {
        int i,count=0;

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }

        return count;
    }

    //Optimization

    static int countfactors_approach2(int n)
    {
        int i,count=0;

        for(i=1;i*i<=n;i++)
        {
           if(n%i==0)
           {
               if(i==n/i)
                   count++;
               else
                   count=count+2;
           }
        }

        return count;
    }
}
