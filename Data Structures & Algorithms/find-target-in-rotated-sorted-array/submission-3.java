class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while (l < r) {
            int mid = l + (r - l)/2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else r = mid;
        }
        int pivot = l;
        l = 0;
        r = nums.length-1;
        if (target >= nums[pivot] && target <= nums[r] ) {
            l = pivot;
        } else r = pivot - 1;
        while (l<=r) {
            int m = l + (r - l)/2;
            if(target > nums[m]) l = m+1;
            else if (target == nums[m]) return m;
            else r = m - 1;
        }   
        return -1;
    }
}
