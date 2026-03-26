
import java.util.*;
public class checkEvenAndOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=15;
        int pos=sc.nextInt();
        int i=sc.nextInt();
        int bitmask=i<<pos;
        if((n & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
