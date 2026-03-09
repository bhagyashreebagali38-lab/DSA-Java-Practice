import java.util.*;
class Search{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        String x=sc.next();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        boolean found=false;
        for(int i=0;i<arr.length;i++){
        if(arr[i].equals(x)){
            found=true;
            break;
        }
    }
        if(found){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
