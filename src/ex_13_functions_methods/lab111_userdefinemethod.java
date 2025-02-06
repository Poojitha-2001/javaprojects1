package ex_13_functions_methods;

public class lab111_userdefinemethod {
    public static void main(String[] args) {
        //1.without return type and without parameter
        // greet();
        //2.with return type without parameter
        //int age = age_to_vote();
        //System.out.println(age);
       //String s=greet();
        //System.out.println(s);
        //3.with parameters without return type(90% uses this)
        //greet_name("poojitha") ;
       // greet_with_fullname("poojitha", "lenkala") ;
        //name_with_details("poojitha",25,80000,"wipro");
       // method2("reguler function from functions") ;
       // Scanner sc=new Scanner(System.in) ;
      //  System.out.println("NAME:");
     //   String name=sc.next() ;
    //    System.out.println("AGE:");
        //int age= sc.nextInt();
       // System.out.println("SALARY:");
       // int salary=sc.nextInt() ;
       // System.out.println("COMPANY:");
       // String company= sc.next();
      //  detailes_of_a_person(name,age,salary,company);
        //// 4.WITH RETURN TYPE ANd WITH PARAMETRS

        int add=sumoftwonumbers(10,20);
        System.out.println("a+b: "+add);
        int add1=sumoftwonumbers(100,200);
        System.out.println("a+b: "+add1);
        int add2=sumoftwonumbers(109,209);
        System.out.println("a+b: "+add2);





    }

    /// /1.without return type and without parameter
    // static void greet(){
    //System.out.println("hi i am with out argument and with out return type");

    //2.with return type without parameter
    //static int age_to_vote() {
        //return 18;
   //static String greet(){
       //return "hi,good morning";
    //3.with parameters without return type
    //static void greet_name(String name){
        //System.out.println(name);
        //static void greet_with_fullname(String firstname, String lastname){
            //System.out.println(firstname+lastname);
   // static void name_with_details(String name,int age,int salary,String company){
       //System.out.println("name:"+name+ "\n age:"+age+"\n salary: "+salary+"\n company:"+ company );
   // static void method2(String project_name){
      //  System.out.println("what is the project_name-> " +project_name);
   // static void detailes_of_a_person(String name,int age,int  salary,String company){
        //System.out.println("NAME:"+name+"\n AGE:"+age+ "\nSALARY:"+"\n COMPANY:"+company);
    //// 4.WITH RETURN TYPE ANY WITH PARAMETRS
    static int sumoftwonumbers(int a,int b){
    return a+b;



        }


    }


