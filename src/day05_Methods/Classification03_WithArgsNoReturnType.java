package day05_Methods;

import java.util.Scanner;

public class Classification03_WithArgsNoReturnType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        sum(a,b);
    }
    static void sum(int a,int b)
    {
        System.out.println(a+b);
    }
}
