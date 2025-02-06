package ex_12_switch;

import java.util.Scanner;

public class lab093_Switch_jdk_13_concept {
    //jdk>13
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();
        switch (number) {
            case 101, 102, 103:
                System.out.println("done");
                break;
            case 201, 202, 203:
                System.out.println("haha");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
