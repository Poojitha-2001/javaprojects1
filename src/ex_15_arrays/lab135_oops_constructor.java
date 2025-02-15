package ex_15_arrays;

public class lab135_oops_constructor {
    public static void main(String[] args) {
        a a1=new a();
        System.out.println(a1);//this is the address of the object

    }
}
class a{//we can also create the other class in one class
    a(){//a() this is constructor this is automatically called when you created the object here class name and the constructor name should be same
        System.out.println("this from other class");
    }
}