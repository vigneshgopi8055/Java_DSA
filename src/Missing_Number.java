package src;

public class Missing_Number {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};

        System.out.println(sort(arr));
    }
    static int sort(int []nums){
        int arr[] = new int[nums.length + 1];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]] = 1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                return i;
            }
        }
        return 0;
    }
}