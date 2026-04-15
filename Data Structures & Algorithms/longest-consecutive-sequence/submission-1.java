class Solution {
    public int longestConsecutive(int[] nums) {

        //store all elements in a hashset
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }

        int res = 0;
        //loop through elements
        for (int num : nums){
            int streak = 0;
            int cur = num;
            //check if set contains a number
            // as well as numbers that follow it
            while(set.contains(cur)){
                streak++;
                cur++;
            }

            //check which streak has been the longest
            res = Math.max(res, streak);
        }
        return res;
        

    }
}
