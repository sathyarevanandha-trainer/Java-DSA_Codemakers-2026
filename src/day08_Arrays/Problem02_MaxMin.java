package day08_Arrays;

import java.util.Scanner;

public class Problem02_MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int max=max_array(a);

        int min=min_array(a);

        System.out.println(max);
        System.out.println(min);

    }

    static int max_array(int[] a)
    {
        int i,n=a.length,max=Integer.MIN_VALUE;

        for(i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }

    static int min_array(int[] a)
    {
        int i,n=a.length,min=Integer.MAX_VALUE;

        for(i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
}
