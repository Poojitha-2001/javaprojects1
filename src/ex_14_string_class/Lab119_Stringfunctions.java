package ex_14_string_class;

import java.util.Locale;

public class Lab119_Stringfunctions {
    public static void main(String[] args) {
        //commonly used functions in string class
        String s="poojitha";
        String s1=new String("lenkala");
        //1.concatination adds the string
        System.out.println(s.concat("lenkala"));
        System.out.println(s.length() );
        System.out.println(s.toLowerCase() );
        System.out.println(s.charAt(4) );
        System.out.println(s.toUpperCase() );
        System.out.println(s.indexOf('j') );
        System.out.println(s.indexOf('o') );//always get you the first occurrence
        System.out.println(s==s1 );
        System.out.println(s.equals(s1) );
        System.out.println(s.equalsIgnoreCase(s1) );
        System.out.println(s.replace('p','P' ));
        String s2="lenkalapoojitha@gmail.com@class";
       String[] SP= s2.split("@") ;
        System.out.println(SP[0]);
        System.out.println(SP[1]);
        System.out.println(SP[2]);
        String s3="hamburger";
        System.out.println( s3.substring(3,9));
        System.out.println(s3.substring(4,8) );
        System.out.println(s3.startsWith("h") );
        System.out.println(s.startsWith("P") );
        System.out.println(s3.endsWith("r") );
        String s4="      poojitha lenkala    ";
        System.out.println(s4.trim() );
        String s5="poojitha";
        System.out.println(s.compareTo(s5) );
        String s6="poojithareddy";
        System.out.println(s.compareTo(s6) );
        String s7="POOJITHA";
        System.out.println(s.compareToIgnoreCase(s7) );
        StringBuilder sb=new StringBuilder("poojitha") ;
        //append just adds the another string the main string same as concat but the main difference is that it attaches the string with out creating the new string
        System.out.println(sb.append("lenkala")) ;











    }
}
