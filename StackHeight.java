class SatckPow{
    public static int CalPow(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return CalPow(x,n/2)*CalPow(x,n/2);
        }
        return CalPow(x,n/2)*CalPow(x,n/2)*x;
        }
        public static void main(String args[]){
            int n=7;
            int x=2;
            int ans=CalPow(n,x);
            System.out.println(ans);
        }
    }
