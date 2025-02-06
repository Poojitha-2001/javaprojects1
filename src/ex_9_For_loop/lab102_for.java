package ex_9_For_loop;

public class lab102_for {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i==5){
                System.out.println("c");
                continue;
            }
            System.out.println(i);
        }
    }
}
