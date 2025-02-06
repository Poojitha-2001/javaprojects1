package ex_08_if_condition;

import java.util.Scanner;

public class lab86_even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter any int number:");
        int input=sc.nextInt();

        if(input%2==0){
            System.out.println("it is a even number");
        }
        else{
            System.out.println("it is a odd number");
        }
        sc.close();



    }
}
