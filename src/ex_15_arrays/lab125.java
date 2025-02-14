package ex_15_arrays;

public class lab125 {
    public static void main(String[] args) {
        int[] marks={25,14,56,15,36,56,77,18,29,49};
        //you need to find out the min value among the marks
      int  minvalue=min_value(marks );
        System.out.println(minvalue );



    }
    static int min_value(int[] marks){
        int min=marks[0];
        for(int i=0;i<marks.length;i++){
            if(min>marks[i ]){
                min=marks[i];
            }
        }
        return min ;

    }
}
