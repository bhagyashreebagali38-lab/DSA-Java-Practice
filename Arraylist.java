import java.util.ArrayList;
class list{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(0);
        list.add(3);
        list.add(6);
        System.out.println(list);
        //to get element
        int ele=list.get(0);
        System.out.println(ele);
        //add element middle
        list.add(1,2);
        System.out.println(list);
    }
}
