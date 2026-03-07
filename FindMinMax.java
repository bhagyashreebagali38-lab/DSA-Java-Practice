class compar{
    public static void main(String args[]){
        int arr[]={22,14,8,17,35,4};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("min:"+min+ "max:"+max);
        }
    }

    
