import java.util.Arrays;

class RangeFinder {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        int second = secondOccurrence(nums, target);
        return new int[]{first, second};
    }
    
    private int firstOccurrence(int[] nums, int target) {
        int i = 0, j = nums.length - 1, first = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                first = mid;
                j = mid - 1; 
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return first;
    }
    
    private int secondOccurrence(int[] nums, int target) {
        int i = 0, j = nums.length - 1, second = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                second = mid;
                i = mid + 1;  
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        RangeFinder solution = new RangeFinder();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("Range: " + Arrays.toString(result));
    }
}
