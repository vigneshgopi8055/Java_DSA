package src;

public class Product_Of_Digits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n == 0){
            return 1;
        }
        return (n%10) * sum(n/10);
    }
}
