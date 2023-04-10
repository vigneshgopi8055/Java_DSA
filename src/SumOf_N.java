package src;

public class SumOf_N {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    static int sum(int n){
        int s = 0;
        if (n ==0)
            return s=s+n;
        return n + sum(n-1);
    }
}
