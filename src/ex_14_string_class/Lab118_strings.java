package ex_14_string_class;

public class Lab118_strings {
    public static void main(String[] args) {
        //(here string created only one time string constent pool because we have same string)
        String s1="POOJITHA";
        String s2="POOJITHA";
        String s3="POOJITHA";
        String s4="POOJITHA";
        String s5="POOJITHA";
        //here poojitha string is created for 4 times in object area in heap area
        String s6=new String("poojitha") ;
        String s7=new String("poojitha") ;
        String s8=new String("poojitha") ;
        String s9=new String("poojitha") ;
        //comparison(==) this just comparise the locations of strings
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        System.out.println(s5==s6);
        System.out.println(s6==s7);
        System.out.println(s7==s8);
        System.out.println(s8==s9);

        //equals functions checks the values
        System.out.println(s1.equals(s2) );
        System.out.println(s2.equals(s3) );
        System.out.println(s3.equals(s4) );
        System.out.println(s4.equals(s5) );
        System.out.println(s5.equalsIgnoreCase(s6) );//it ingnores the case sensitivity
        System.out.println(s6.equals(s7) );
        System.out.println(s7.equals(s8) );



    }
}
