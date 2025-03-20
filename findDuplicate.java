class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) { 
            if (seen[nums[i]]) { 
                return nums[i]; 
            } 
            seen[nums[i]] = true; 
        } 
        return -1; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + solution.findDuplicate(nums));
    }
}