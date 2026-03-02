class Recursion{
public static int printfact(int n){
if(n==0||n==1){
return 1;
}
return n*printfact(n-1);
}
public static void main(String[] args){
int n=5;
int result=printfact(n);
System.out.println(result);
}
}
