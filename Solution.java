class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int prefixSum[] = new int[n + 1];
        int max = 0;
        prefixSum[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + gain[i - 1];
            max = Math.max(max, prefixSum[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] gain = {-5, 1, 5, 0, -7};
        int result = sol.largestAltitude(gain);
        System.out.println("Largest Altitude: " + result);
    }
}
