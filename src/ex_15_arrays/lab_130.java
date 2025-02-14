package ex_15_arrays;

import java.util.Scanner;

public class lab_130 {
    //taking inputes from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght that array should be:  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("eneter the numbers: ");
            numbers[i]=sc.nextInt() ;
        }
        for(int i=0;i< numbers.length ;i++){
            System.out.println(numbers[i ]);
        }
    }
}
