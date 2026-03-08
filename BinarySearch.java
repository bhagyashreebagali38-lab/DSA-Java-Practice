import java.util.*;
class math{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,9,17,23,25,45,59,63,71};
        int x=sc.nextInt();
        int l=0;
        int r=arr.length-1;
        boolean found=false;
        while(l<=r){

            int mid=(l+r)/2;
                if(arr[mid]==x){
                    System.out.println("element found at position:"+mid);
                    found=true;
                    break;
                }
                if(arr[mid]>x){
                    r=mid-1;
                        }
                        else{
                            l=mid+1;
                        }
                    }
                        if(!found){
                            System.out.println("element not found");
                        }
                    }
                }
