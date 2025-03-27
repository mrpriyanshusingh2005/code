class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int sol = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long ans = (long) mid * mid;  
            if (ans == x) {
                return mid;
            }
            if (ans < x) {
                sol = mid;  
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 8;  
        int result = solution.mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }
}
