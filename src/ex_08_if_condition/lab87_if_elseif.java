package ex_08_if_condition;

import java.util.Scanner;

public class lab87_if_elseif {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("1st number: ");
        int input1= sc1.nextByte();
        Scanner sc2=new Scanner(System.in);
        System.out.println("2nd number: ");
        int input2= sc2.nextByte();
        if(input1>input2){
            System.out.println("input 1 is grater");
        }
        else if (input2>input1 ) {
            System.out.println("input 2 is grater");
        }
        else{
            System.out.println("equal");
        }

    }
}
