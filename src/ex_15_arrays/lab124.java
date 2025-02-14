package ex_15_arrays;

import java.util.Arrays;

public class lab124 {
    public static void main(String[] args) {
        int[] marks={25,14,56,15,36,56,77,18,29,49};
        //now you need find the max
        //logic buileding formula
        //1.inputs-given -array-int
        //2.output - single int
        int maxvalue=max_from_the_array(marks );
        System.out.println(maxvalue );

    }
    //now we are creating a function/method
    //to find out mas from a array you need a function which as the return type and also parameters
    static int max_from_the_array(int[] marks) {
        int max=marks[0];
        for (int i = 0; i <marks.length ; i++) {
          if(marks[i]>max ){
              max=marks[i ];
          }


        }
        return max ;

    }
    }


