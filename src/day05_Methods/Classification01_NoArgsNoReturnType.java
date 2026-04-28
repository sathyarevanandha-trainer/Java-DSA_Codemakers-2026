package day05_Methods;

import java.util.Scanner;

public class Classification01_NoArgsNoReturnType {
    public static void main(String[] args) {
        sum();
    }
    static void sum()
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int c=a+b;

        System.out.println(c);
    }
}
