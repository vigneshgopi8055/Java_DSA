package src;

public class Count_Paths_In_Maze {
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
    }
    static int countPaths(int r , int c ){
        if (r == 1 || c == 1)
            return 1;
        int down = countPaths(r-1,c);
        int right = countPaths(r,c-1);
        return down+right;
    }
}
