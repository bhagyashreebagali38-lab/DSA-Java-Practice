class solution{
    int celebrity(int[][] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
            while(st.size()>1){
                int i=st.pop();
                int j=st.pop();
                if(arr[i][j]==1){
                    st.push(j);
                }
                else
                    st.push(i);
                }
            }
                int cle=st.pop();
                for(int i=0;i<n;i++){
                    if(i!=cle&& a[i][cle]==1 || a[cle][i]==0){
                        return -1;
                    }
                    else cle;
                }
