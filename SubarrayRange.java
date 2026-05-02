
class Solution {
    public long sumSubarrayRange(int[] arr) {
        long summax=getmax(arr);
        long summin=getmin(arr);
        return summax-summin;
        private long getmax(int[] arr) {
            int n=arr.length;
            Stack<Integer> st = new Stack<>();
            int[] pse = new int[n];
            int[] nse = new int[n];

        // PSE
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                    st.pop();
                }
                pse[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }

            st.clear();

        // NSE
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                    st.pop();
                }
                nse[i] = st.isEmpty() ? n : st.peek();
                st.push(i);
            }

            long ans = 0;

            for (int i = 0; i < n; i++) {
                long left = i - pse[i];
                long right = nse[i] - i;

                ans = ans+(long)arr[i] * left * right;
            }
            return ans;
        }
        private long getmin(int[] arr){
            int n=arr.length;
            Stack<Integer> st = new Stack<>();
            int[] pse = new int[n];
            int[] nse = new int[n];

        // PSE
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }
                pse[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }

            st.clear();

        // NSE
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    st.pop();
                }
                nse[i] = st.isEmpty() ? n : st.peek();
                st.push(i);
            }

            long ans = 0;

            for (int i = 0; i < n; i++) {
                long left = i - pse[i];
                long right = nse[i] - i;

                ans = ans + (arr[i] * left * right);
            }
            return ans;
        }
    }
}
