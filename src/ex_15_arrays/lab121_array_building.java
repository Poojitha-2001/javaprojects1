package ex_15_arrays;

public class lab121_array_building {
    public static void main(String[] args) {
        //arrays are the set of data with same data type
        int[] marks={70,80,90,50,80};
        System.out.println(marks.length);//length is not a function it is a property of array so here we will not use()
        System.out.println(marks[1]);
        System.out.println(marks[4]);
        //another way of creating the array
        int[] marks1=new int[6] ;//size is fixed to 6 here
        //int marks1[]=new int[6] this is also correct
        //now you wanna togive the numbers to the set
        marks1[0]=10;
        marks1[1]=80;
        marks1[2]=90;
        marks1[3]=98;
        marks1[4]=97;
        marks1[5]=93;
        //length of marks1
        System.out.println(marks1.length );
        System.out.println(marks1[5]);
        System.out.println(marks1[-1]);//out of bound exception



    }
}
