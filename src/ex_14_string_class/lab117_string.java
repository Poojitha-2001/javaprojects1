package ex_14_string_class;

public class lab117_string {
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

    }
}
