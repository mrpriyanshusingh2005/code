class perfectSquare {
    public boolean isPerfectSquare(int num) {
        int i = 0;
        int j = num;
        while (i <= j) {
            int mid = i + (j - i) / 2; 
            long ans = (long) mid * mid; 
            if (ans == num) {
                return true;
            }
            if (ans > num) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }  
        return false;
    }
    public static void main(String[] args) {
        perfectSquare solution = new perfectSquare();
        int num = 16; 
        boolean result = solution.isPerfectSquare(num);
        System.out.println(num + " is a perfect square: " + result);
    }
}
