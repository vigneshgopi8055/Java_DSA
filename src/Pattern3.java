package src;

public class Pattern3 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = row; i >= 0; i--) {      //pyramid
            for (int j = 0; j < col-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < row; i++) {   //inverted  pyramid
            for (int j = 0; j < col-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

