import java.util.*;
class sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        boolean found=true;
        for(int i=0;i<n;i++){
                if(a[i]+b[n-1-i]<k){
                    found=false;
                break;
            }
        }
                System.out.println(found);
        }
    }
