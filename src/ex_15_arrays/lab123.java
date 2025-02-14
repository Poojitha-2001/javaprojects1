package ex_15_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class lab123 {
    public static void main(String[] args) {
        String[] names={"poojitha","amith","mini"};//predefined elements

        //useing for loop
        //we can do in 2 ways
        //for(int i=0;i<=2;i++){
            //System.out.println(names[i ]);
        for(int i=0;i<names.length ;i++){
            System.out.println("names="+names[i ] );

        }
        int[] marks={70,79,68,58,90,100};
        for(int i=0;i<marks.length ;i++){
            System.out.println("marks= "+marks[i ]);
        }


    }
}
