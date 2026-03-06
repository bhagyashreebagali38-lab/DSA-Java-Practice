import java.util.*;
class linearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("linear search found"+i);
                found=true;
                break;
            }
        }
            if(found==false)
            {
                System.out.println("linear search not found");
            }
        }

    }
