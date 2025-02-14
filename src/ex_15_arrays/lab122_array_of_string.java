package ex_15_arrays;

public class lab122_array_of_string {
    public static void main(String[] args) {
        //creating the array of strings
        String[] names={"poojitha","amith","mini"};//predefined elements
        System.out.println(names.length) ;
        System.out.println(names[2]);
        //other way of creating array of strings
        String[] names1=new String[3] ;
        names1[0]="poojitha";
        names1[1]="pooj";
        names1[2]="pooji";
        System.out.println(names1[1]);
        //creating array for boolean
        boolean[] is_male_data={true ,false };
        System.out.println(is_male_data[1]);
        System.out.println(is_male_data[0]);

        //useing new keyword
        boolean[] is_male_data1=new boolean[2] ;
        is_male_data1[0]=true ;
        is_male_data1[1]=false ;





    }
}
