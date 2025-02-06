package ex_08_if_condition;

import java.util.Scanner;

public class lab89_if_elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("score: ");
        int Score= sc.nextByte();
        if(Score>=90 && Score<=100){
            System.out.println('A');
        }
        else if (Score>=80 && Score<=89){
            System.out.println('B');
        }
         else if (Score>=70 && Score<=79){
                    System.out.println('C');
                }
        else if (Score>=60 && Score<=69){
            System.out.println('D');
        }
        else if (Score>=50 && Score<=59){
            System.out.println('E');
        }
        else if (Score>=100 || Score<=0){
            System.out.println('0');
        }
        else {
            System.out.println('F');
        }

    }
}
