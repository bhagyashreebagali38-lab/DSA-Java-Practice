class Union{
    public static void main(String args[]){
        int arr1[]={2,4,6};
        int arr2[]={1,2,3};
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i]+"");
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j]+"");
                j++;
            }
            else{
                System.out.println(arr1[i]+"");
                i++;
                j++;
                }
            }
            while(i<arr1.length){
                System.out.println(arr1[i++]+"");
            }
            while(j<arr2.length){
                System.out.println(arr2[j]+"");
            }
        }
    }
