package src;

public class Pattern1 {
    public static void main(String[] args) {
        int rows=5;
        int col=4;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
