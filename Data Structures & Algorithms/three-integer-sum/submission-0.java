class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // important to note:
        //groups must be unique
        //array must be sorted for hashset to correctly identify duplicates

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            for (int j = i+ 1; j < nums.length; j++){
                for (int k = j +1; k < nums.length ; k++){
                        if (nums[i] + nums[j] + nums[k] == 0){
                            List<Integer> group = new ArrayList<>();
                            group.add(nums[i]);
                            group.add(nums[j]);
                            group.add(nums[k]);
                            res.add(group);
                        }
                    
                }
            }
           
        }
        List<List<Integer>> ans = new ArrayList<>(res);
        return ans ;
    }

}
