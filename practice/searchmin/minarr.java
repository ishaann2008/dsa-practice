public class minarr {
    public static void main(String[] args) {
        
        int [] arr1 = {5,4,3,2,2};
        int ans = searchmin(arr1);
        System.out.println(ans);
        }
    static int searchmin(int [] arr )
    {
        int min1 = 0;
        int length = arr.length;

        for(int i =0; i<length;i++)
            {
                if (arr[i] < arr[min1] )
                {
                    min1 = i;
                }
            } 
            return arr[min1];
    }

    }
