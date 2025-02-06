package ex_12_switch;

public class lab094_switch_jdk_13 {
    //jdk>13
    public static void main(String[] args) {
        int inteamcode = 001;//jdk>13
        switch (inteamcode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("invalid");


        }
    }
}