class Recurf{
public void num(int n){
    if(n==0||n==1){
        return;

    }
    System.out.println(n);
    int num1=n-1;
    int result=n*num1;
    System.out.println(result);
    }
    public static void main(String args[]){
        int n=5;
        nai3 nai=new nai3();
        
        nai.num(n);
    }
}
