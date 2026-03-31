class perm1{
    public static void printPerm(String str,String perm){        
      if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curCh=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPerm(newstr,perm+curCh);
        }
    }
    public static void main(String args[]){
        String str="abc";
        printPerm(str,"");
    }
}
