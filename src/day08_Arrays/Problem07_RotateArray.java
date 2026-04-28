package day08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem07_RotateArray {
    public static void main(String[] args) {

        //----Leetcode Problem----

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int k=sc.nextInt();

//        rotateArray_approach1(a,k);
//        System.out.println(Arrays.toString(a));

        rotateArray_approach2(a,k);
        System.out.println(Arrays.toString(a));
    }


    //Bruteforce
    static void rotateArray_approach1(int[] a,int k)
    {
        int n=a.length,i,j,temp;

        for(j=1;j<=k;j++)
        {
            temp=a[n-1];
            for(i=n-1;i>=1;i--)
            {
                a[i]=a[i-1];
            }
            a[i]=temp;
        }
    }


    //Optimization
    static void rotateArray_approach2(int[] a,int k)
    {
        int n=a.length;

        k=k%n;

        reverse_in_Range(a,0,n-1);
        reverse_in_Range(a,0,k-1);
        reverse_in_Range(a,k,n-1);

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
