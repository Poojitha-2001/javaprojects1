package ex_14_string_class;

public class Lab120_stringbuilder_stringbuffer {
    public static void main(String[] args) {
        //String builder
        StringBuilder sb=new StringBuilder("POOJITHA") ;
        System.out.println(sb.append("reddy")) ;//here it does not creat new string called as reddy it just addes to the main string
        System.out.println(sb.reverse() );
        //string buffer
        StringBuffer sb1=new StringBuffer("POOJITHA") ;
        System.out.println(sb1.append("reedy") );
        System.out.println(sb1.reverse() );
        //normal string class
        String s="POOJITHA";
        System.out.println(s.concat("reddy") );//here in the string constant pool there are 3 strings stored




    }



}
