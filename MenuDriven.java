import java.util.*;
class menu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
        do{
            int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("this is good");
            }
            else if(marks<=89&&marks>=60){
                System.out.println("this is also good");
            }
            else if(marks<=59&&marks>0){
                System.out.println("this is well");
            }
            else{
                System.out.println("stop");
            }
            i=sc.nextInt();
        }
            while(i==1);
                i++;
            }
        }

