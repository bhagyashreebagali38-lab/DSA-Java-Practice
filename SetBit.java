import java.util.*;
public class Bit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=2;
        int pos=sc.nextInt();
        int i=sc.nextInt();
        int bitmask=i<<pos;
        int newNumber=(n | bitmask);
        System.out.println(newNumber);
    }
}
   
