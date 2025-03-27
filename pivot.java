public class pivot {
    public int pivotElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (mid+1 <= j && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid-1 >= i && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }
            if (nums[i] > nums[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        pivot obj = new pivot();
        int[] nums = {9, 10, 2, 4, 6, 8};
        int res = obj.pivotElement(nums);
        System.out.println(res);
    }
}
