class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;

        SearchInsertPosition searcher = new SearchInsertPosition();
        System.out.println("Index for target " + target1 + ": " + searcher.searchInsert(nums, target1)); 
        System.out.println("Index for target " + target2 + ": " + searcher.searchInsert(nums, target2)); 
        System.out.println("Index for target " + target3 + ": " + searcher.searchInsert(nums, target3)); 
        System.out.println("Index for target " + target4 + ": " + searcher.searchInsert(nums, target4)); 
    }
}
