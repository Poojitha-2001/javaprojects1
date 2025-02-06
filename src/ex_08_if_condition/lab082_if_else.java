package ex_08_if_condition;

import java.util.Scanner;

public class lab082_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int age=sc.nextInt() ;
        if(age>18){
            System.out.println("you are allowed to vote");
        }
        else {
            System.out.println("you are not allowed to vote");
        }


    }
}
