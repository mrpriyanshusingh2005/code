class RotatedBinarySearch {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[i] <= nums[mid]) { 
                if (nums[i] <= target && target < nums[mid]) {
                    j = mid - 1; 
                } else {
                    i = mid + 1; 
                }
            } 
            else if (nums[j] >= nums[mid]) { 
                if (nums[mid] < target && target <= nums[j]) {
                    i = mid + 1; 
                } else {
                    j = mid - 1; 
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 8, 1, 2, 3, 4, 5};
        int target = 3; 
        RotatedBinarySearch searchObj = new RotatedBinarySearch();
        int result = searchObj.search(nums, target);
 
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
