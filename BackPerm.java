class permution{
    public static void perm(String str,String perm,int index){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            perm(newstr,perm+curchar,index+1);
        }
    }
    public static void main(String args[]){
        String str="ABC";
        perm(str," ",0);
    }
}
