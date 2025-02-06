package ex_9_For_loop;

public class lab103_for {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i%2==0){
                System.out.println("even"+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
