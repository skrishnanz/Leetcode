class Solution {
    public int heightChecker(int[] heights) {
        int[] a = Arrays.copyOf(heights, heights.length);
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != a[i]) {
                count++;
            }
        }
        return count;
    }
}