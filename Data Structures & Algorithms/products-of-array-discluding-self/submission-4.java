class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        int prefix = 1;
        for (int i = 0; i<nums.length; i++) {
            arr[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postfix = 1;
        for (int j = nums.length-1; j >=0; j--) {
            arr[j] = arr[j]*postfix;
            postfix = postfix*nums[j];
        }
        return arr;
    }
}  
