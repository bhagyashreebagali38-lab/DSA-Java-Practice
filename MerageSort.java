class Mergesort{
    public static void divide(int arr[],int lb,int ub){
        if(lb>=ub){
            return;
        }
        int mid=lb+(ub-lb)/2;
        divide(arr,lb,mid);
        divide(arr,mid+1,ub);
        conquare(arr,mid,lb,ub);
    }
    public static void conquare(int arr[],int mid,int lb,int ub){
        int merge[]=new int[ub-lb+1];
        int index1=lb;
        int index2=mid+1;
        int k=0;
        while(index1<=mid && index2<=ub){
            if(arr[index1]<=arr[index2]){
                merge[k++]=arr[index1++];
            }
            else{
                merge[k++]=arr[index2++];
                }
            }
            while(index1<=mid){
            merge[k++]=arr[index1++];
            }
            while(index2<=ub){
            merge[k++]=arr[index2++];
        }
        for(int i=0,j=lb;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,1,5,4};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
