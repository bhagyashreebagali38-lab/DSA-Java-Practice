import java.util.*;
public class Bit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=6;
        int pos=sc.nextInt();
        int i=sc.nextInt();
        int bitmask=i<<pos;
        if((bitmask & n)==0){
            System.out.println("bitmask 0");
        }
        else{
            System.out.println("bitmask 1");
        }
        }
    }
