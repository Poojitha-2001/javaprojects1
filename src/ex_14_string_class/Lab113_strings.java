package ex_14_string_class;

public class Lab113_strings {
    //strings are immutable
    public static void main(String[] args) {
        String s1="hello";
       s1= s1.concat("world") ;
        System.out.println(s1);
    }
}
