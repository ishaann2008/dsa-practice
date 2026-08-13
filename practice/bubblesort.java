import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
       int [] arr1 ={1,4,6,2,4,6};
       bubblesort(arr1);
       System.out.println(Arrays.toString(arr1)); 
    }
    
    static void bubblesort(int [] arr)
    {
        for (int i=0;i<arr.length; i++)
        {
            for (int j=1;j<arr.length-i;j++)
            {
                if (arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
