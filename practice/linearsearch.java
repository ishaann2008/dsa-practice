public class linearsearch {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
       

        int target1 = 2;
        int ans = linearsearch1(arr1, target1);
        System.out.println(ans);
        }
    static int linearsearch1(int [] arr , int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        for (int i =0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return 1;
            }
        }
        return -1;
    }
}
