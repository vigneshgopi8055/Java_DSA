package src;

public class Armstrong_Recursion {
    public static void main(String[] args) {
        int ans = 123;
        System.out.println(Armstrong(ans));
    }
    static int Armstrong(int n){
        if (n==0){
            return 0;
        }
        return (int) ((Math.pow(n%10,3)) + Armstrong(n/10));
    }
}
