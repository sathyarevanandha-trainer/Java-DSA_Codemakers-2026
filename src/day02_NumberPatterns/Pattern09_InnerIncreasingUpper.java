package day02_NumberPatterns;

import java.util.Scanner;

public class Pattern09_InnerIncreasingUpper {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int i,j,ans;

        for(i=0;i<=n;i++)
        {
            ans=i;
            for(j=0;j<=2*n;j++)
            {
                if(i+j>=2*n)
                {
                    System.out.print(ans);
                    ans--;
                }
                else if(j<=i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
