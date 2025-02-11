package ex_14_string_class;

import java.util.Locale;

public class Lab119_Stringfunctions {
    public static void main(String[] args) {
        //commonly used functions in string class
        String s="poojitha";
        String s1=new String("lenkala");
        //1.concatination adds the string
        System.out.println(s.concat("lenkala"));
        //2.finding the length of the string
        System.out.println(s.length() );
        //3.changes the string to the lower case
        System.out.println(s.toLowerCase() );
        //4.finds the char at specific index
        System.out.println(s.charAt(4) );
        //5.it converts into the upper cases
        System.out.println(s.toUpperCase() );
        //6.it findes the index of the specific char
        System.out.println(s.indexOf('j') );
        System.out.println(s.indexOf('o') );//always get you the first occurrence
        //7.it compares the locations of the strings
        System.out.println(s==s1 );
        //8.it checks the strings are same or not
        System.out.println(s.equals(s1) );
        //9.it checks the string are same or not with looking for the cases
        System.out.println(s.equalsIgnoreCase(s1) );
        //10.it replaces the charecter with other charecter
        System.out.println(s.replace('p','P' ));
        //11.it splits the string
        String s2="lenkalapoojitha@gmail.com@class";
       String[] SP= s2.split("@") ;
        System.out.println(SP[0]);
        System.out.println(SP[1]);
        System.out.println(SP[2]);
        //12.substring is a string where we can extract that from the main string
        String s3="hamburger";
        System.out.println( s3.substring(3,9));
        System.out.println(s3.substring(4,8) );
        //13.it checks the string prefix
        System.out.println(s3.startsWith("h") );
        System.out.println(s.startsWith("P") );
        //14.it checks the string suffix is same or not
        System.out.println(s3.endsWith("r") );
        //15.trim just trim the extra spaces in the string
        String s4="      poojitha lenkala    ";
        System.out.println(s4.trim() );
        //16.compare just compare the string and it gives sthe output in intiger format.it compares lexicographically
        String s5="poojitha";
        System.out.println(s.compareTo(s5) );
        String s6="poojithareddy";
        System.out.println(s.compareTo(s6) );
        String s7="POOJITHA";
        //17.it compares and ignores the cases
        System.out.println(s.compareToIgnoreCase(s7) );
        //string builder class
        StringBuilder sb=new StringBuilder("poojitha") ;
        //append just adds the another string the main string same as concat but the main difference is that it attaches the string with out creating the new string
        System.out.println(sb.append("lenkala")) ;











    }
}
