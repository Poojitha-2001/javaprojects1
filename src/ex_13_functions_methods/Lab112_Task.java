package ex_13_functions_methods;

import java.util.Scanner;

public class Lab112_Task {
    //creat a function of sub,sum,mul,div
    //with parameters a,b(take the parameters from user)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of a: ");
        int a = sc.nextInt();
        System.out.println("value of b: ");
        int b = sc.nextInt();
        int add = sum_of_two(a, b);
        System.out.println("a+b:" + add);
        int sub = sub_of_two(a, b);
        System.out.println("a-b:" + sub);
        float div = div_of_two(a, b);
        System.out.println("a/b:" + div);
        int mul = mul_of_two(a, b);
        System.out.println("a*b:" + mul);
        int mod=mod_of_two(a,b);
        System.out.println("a%b:"+mod);



    }

    static int sum_of_two(int a, int b) {
        return a + b;

    }

    static int sub_of_two(int a, int b) {
        return a - b;
    }

    static float div_of_two(int a, int b) {
        if (b == 0) {
            System.out.println("div by zero is not allowed");
        }
        return a / b;
    }

    static int mul_of_two(int a, int b) {
        return a * b;

    }
    static int mod_of_two(int a,int b){
        return a%b;
    }
}
