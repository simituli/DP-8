//Time Complexity:O(n*2)
//Space Complexity: O(n)
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int count =0;
        for(int i=2;i<n;i++)
        {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
            {
                dp[i]=dp[i-1]+1;
                count= count+dp[i];
            }
        }
        return count;
    }
}
