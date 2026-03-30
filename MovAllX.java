class Mov1{
    public static void movalx(String str,int index,int count,String newstring){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newstring+='x';
            }
            System.out.println(newstring);
            return;
        }
        char curStr=str.charAt(index);
        if(curStr=='x'){
            count++;
            movalx(str,index+1,count,newstring);
        }
        else{
            newstring+=curStr;
            movalx(str,index+1,count,newstring);
        }
    }
    public static void main(String args[]){
        String str="axnbxxef";
        movalx(str,0,0,"");
    }
    }
