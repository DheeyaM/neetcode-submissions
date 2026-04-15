class Solution {
    public int search(int[] nums, int target) {

        int r = nums.length -1;
        int l = 0;

        //finding the smallest element is finding where the rotation ended
        while (r > l){
            int mid = l + ( r - l) /2;
            if (nums[mid] > nums[r]){
                l = mid +1;
            } else {
                r = mid;
            }  
        }

        //l is the minimum so we assign it to the pivot
        int pivot = l;
          r = nums.length -1;
         l = 0;

        if (target >= nums[pivot] && target <= nums[r]){
            l = pivot;
        } else {
            r = pivot - 1;
        }

        while (r>=l){
            int m = l + (r-l)/2;
            if (nums[m] == target){
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
                    }


        return -1;
    }
}
