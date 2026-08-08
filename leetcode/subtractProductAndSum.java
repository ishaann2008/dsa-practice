class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int i;

        int product = 1;
        String N = Integer.toString(n);
        int size = N.length();
        int digit;
        int difference;

        
        
            for (i=0;i<size;i++)
            {
                digit = N.charAt(i)-'0';
                sum = sum+ digit;
                product = product*digit;
            }
            
            
             difference = product - sum;
            
            
            return difference;
        
    }
}
