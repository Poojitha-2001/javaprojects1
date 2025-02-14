package ex_15_arrays;

import java.util.Scanner;

public class lab134_right_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in ) ;
        System.out.println("size of the row: ");
        int size=sc.nextInt() ;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
