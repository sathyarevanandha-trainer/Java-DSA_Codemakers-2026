package day02_NumberPatterns;

import java.util.Scanner;

public class Pattern08_Butterfly {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int i,j,ans;

        //Butterfly Number ---> Combine ButterflyUpper and ButterflyLower
        //remove the center row from the ButterflyUpper or ButterflyLower


        for(i=1;i<n;i++)
        {
            ans=i;
            for(j=1;j<=2*n-1;j++)
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
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for(i=n;i>=1;i--)
        {
            ans=i;
            for(j=1;j<=2*n-1;j++)
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
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
