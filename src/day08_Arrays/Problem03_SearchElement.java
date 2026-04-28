package day08_Arrays;

import java.util.Scanner;

public class Problem03_SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        boolean ans=isPresent(a,k);

        System.out.println(ans);

    }
    static boolean isPresent(int[] a, int k)
    {
        int i,n=a.length;

        for(i=0;i<n;i++)
        {
            if(a[i]==k)
                return true;
        }
        return false;
    }
}
