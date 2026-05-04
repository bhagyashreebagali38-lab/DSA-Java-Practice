class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] pvsm = new int[n][m];
        int maxArea = 0;

        // Build heights (column-wise)
        for (int j = 0; j <= m - 1; j++) {
            int sum = 0;
            for (int i = 0; i <= n - 1; i++) {

                // FIX 1: char handling
                if (matrix[i][j] == '1') {
                    sum += 1;
                } else {
                    sum = 0;
                }

                pvsm[i][j] = sum;
            }
        }

        // Apply histogram row-wise
        for (int i = 0; i <= n - 1; i++) {

            // FIX 2: correct function + Math.max
            maxArea = Math.max(maxArea, largestRectangleArea(pvsm[i]));
        }

        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && heights[st.peek()] > curr) {
                int h = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right - left - 1;

                maxArea = Math.max(maxArea, h * width);
            }

            st.push(i);
        }

        return maxArea;
    }

}
    
