package src;

public class Count_Paths_In_Maze {
    public static void main(String[] args) {
        int m = 3; int n = 3;
        System.out.println(countPaths(0,0,m,n));
    }
    static int countPaths(int i , int j , int n, int m){
        if (i == n || j == m)
            return 0;
        if (i == n-1 && j == m-1)
            return 1;
        int down = countPaths(i+1,j,n,m);
        int right = countPaths(i,j+1,n,m);
        return down+right;
    }
}
