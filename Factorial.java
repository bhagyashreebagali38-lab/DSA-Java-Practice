class recursive{
    public static int printFact(int n){
    if(n==0){
        return 1;
    }
    int num1=printFact(n-1);
    int num=n*num1;
    return num;
}
    public static void main(String[] args){
        int n=5;
        int result=printFact(n);
        System.out.println(result);
    }
}
