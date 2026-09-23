class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        int pre = 1;
        for (int i=0; i<nums.length;i++) {
            arr[i]=pre;
            pre=pre*nums[i];
        }
        int post = 1;
        for (int j=nums.length-1; j>=0; j--) {
            arr[j] = arr[j] * post;
            post = post*nums[j];
        }
        return arr;
    }
}  
