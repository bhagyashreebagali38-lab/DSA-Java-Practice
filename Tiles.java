class Tile{
    public static int TilesPlace(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        return TilesPlace(n-1,m)+TilesPlace(n-m,m);
    }
    public static void main(Strig args[]){
        int n=3;
        int m=3;
        System.out.println(TilesPlace(n,m));
    }
}
