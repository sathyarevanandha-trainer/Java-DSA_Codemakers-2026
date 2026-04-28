package day02_NumberPatterns;

import java.util.Scanner;

public class Pattern13_InnerDecreasingLower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int i,j,ans,res;

        //Reverse the i loop
        for(i=n;i>=0;i--)
        {
            ans=n;
            res=n-i;
            for(j=0;j<=2*n;j++)
            {
                if(i+j>=2*n)
                {
                    System.out.print(res);
                    res++;
                }
                else if(j<=i)
                {
                    System.out.print(ans);
                    ans--;
                }
                else
                {
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
    }
}
