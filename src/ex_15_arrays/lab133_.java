package ex_15_arrays;

public class lab133_ {
    public static void main(String[] args) {
        int[][] numbers={{10,20,30},{20,30,40},{40,50,59}};
        for(int i=0;i<numbers.length;i++){//this is the length of the row(row length is 3)
            for(int j=0;j<numbers[i ].length;j++){
                System.out.print(numbers[i][j]+"|");//prints in same line


            }
            System.out.println();//after completing 3 numbers it goes to the next line

        }

    }
}
