package ex_12_switch;

import java.util.Scanner;

public class lab092_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a browser: ");
        String  browser = sc.next();
        switch (browser ){
            case "chrome":
            System.out.println("start opening chrome");
            break;
            case "edge":
                System.out.println("start opening edge");
                break;
            case "safari":
                System.out.println("start opening safari");
                break;
            default:
                System.out.println("unknown browser");
        }


    }
}
