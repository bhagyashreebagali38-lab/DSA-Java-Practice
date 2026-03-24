import java.util.*;
class string{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String combine=a+" "+b;
        System.out.println(combine.length());
        for(int i=0;i<combine.length();i++){
          System.out.println(combine.charAt(i));
        }
    }
  }
