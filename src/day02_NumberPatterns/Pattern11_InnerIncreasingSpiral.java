package day02_NumberPatterns;

import java.util.Scanner;

public class Pattern11_InnerIncreasingSpiral {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int i,j,ans;

        //Inner Increasing Spiral ---> Combine Inner Increasing Upper and Inner Increasing Lower
        //remove the center row from the Inner Increasing Upper or Inner Increasing Lower

        for(i=0;i<n;i++)
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



        for(i=n;i>=0;i--)
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
