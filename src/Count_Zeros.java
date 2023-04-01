package src;

public class Count_Zeros {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(count(n,0));
    }

    static int count(int n,int c){
        if (n == 0)
            return c;
        int rem = n%10;
        if (rem == 0){
            c = c+1;
            count(n/10 , c+1);
        }
        return count(n/10 , c);
    }
}
