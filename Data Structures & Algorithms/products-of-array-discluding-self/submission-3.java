class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        int prefix = 1;
        for (int i=0; i<nums.length; i++) {
            arr[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postfix = 1;
        for (int i=nums.length-1; i>=0; i--) {
            arr[i] = postfix*arr[i];
            postfix = postfix * nums[i];
        }
        return arr;
    }
}  
