package ex_08_if_condition;

import java.util.Scanner;

public class lab090_trangle_classifiers {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the length side1:");
        double side1 = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the length side2:");
        double side2 = sc2.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter the length side3:");
        double side3 = sc3.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("input invalid");
        } else {
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("It is Equilateral Trangle");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("It is isosceles Trangle");
            } else {
                System.out.println("It is Equilateral Trangle");
            }
            sc1.close();


        }
    }
}
