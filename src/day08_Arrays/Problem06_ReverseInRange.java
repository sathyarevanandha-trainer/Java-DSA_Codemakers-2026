package day08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem06_ReverseInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int s=sc.nextInt();
        int e=sc.nextInt();

        reverse_in_Range(a,s,e);

        System.out.println(Arrays.toString(a));


    }

    static void reverse_in_Range(int[] a,int s,int e)
    {
       int temp;

        while(s<e)
        {
            temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
}
