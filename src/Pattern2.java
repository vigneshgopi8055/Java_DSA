package src;

public class Pattern2 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < col-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
