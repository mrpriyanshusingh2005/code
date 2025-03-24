class MountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] < arr[mid + 1]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        MountainArray solution = new MountainArray();
        int[] arr = {0, 2, 4, 6, 5, 3, 1}; // Example mountain array
        int peakIndex = solution.peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + peakIndex);
    }
}
