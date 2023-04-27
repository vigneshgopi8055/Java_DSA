package src;

public class Exception_Handling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("executed successfully");
        }
        if (b == 0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
