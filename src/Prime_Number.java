package src;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println(prime(36));
    }
    static boolean prime(int n){
        if (n<=1)
            return false;
        int i = 2;
        while (i*i<=n){
            if (n%i==0)
                return false;
            i++;
        }
        return true;
    }
}
