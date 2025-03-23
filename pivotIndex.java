class pivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        } 
        int ls = 0, rs = 0;
        for (int num : nums) {
            rs += num;
        }
        for (int j = 0; j < nums.length; j++) {
            rs -= nums[j]; 
            if (ls == rs) {
                return j; 
            }
            ls += nums[j]; 
        }
        return -1;
    }
    public static void main(String[] args) {
        pivotIndex solution = new pivotIndex();
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};
        System.out.println("Pivot Index of nums1: " + solution.pivotIndex(nums1)); 
        System.out.println("Pivot Index of nums2: " + solution.pivotIndex(nums2)); 
        System.out.println("Pivot Index of nums3: " + solution.pivotIndex(nums3)); 
    }
}
