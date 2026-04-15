class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int res = 0;
        for (int num : nums){
            int streak = 0;
            int cur = num;
            while(set.contains(cur)){
                streak++;
                cur++;
            }
            res = Math.max(res, streak);
        }
        return res;
        

    }
}
