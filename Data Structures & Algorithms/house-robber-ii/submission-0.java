class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] skipFirst = new int[nums.length -1];
        int[] skipLast = new int[nums.length- 1];

        for (int i = 0; i < nums.length -1; i++){
            skipFirst[i] = nums[i+1];
            skipLast[i] = nums[i];
        }

        int skipFirstTotal = robHelper(skipFirst);
        int skipLastTotal = robHelper(skipLast);

        return Math.max(skipFirstTotal, skipLastTotal);
    }

    private int robHelper(int[] array){
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        int[] dp = new int[array.length];
        dp[0] = array[0];
        dp[1] = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++){
            dp[i] = Math.max(dp[i-2] + array[i], dp[i-1]);
        }

        return dp[array.length -1];
    }
}
