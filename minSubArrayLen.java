class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE; 
        int i = 0;
        int sum = 0; 
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];  
            while (sum >= target) { 
                min = Math.min(min, j - i + 1); 
                sum -= nums[i++]; 
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = solution.minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray: " + result);
    }
}
