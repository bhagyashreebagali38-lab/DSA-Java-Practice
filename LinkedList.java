import java.util.*;
class LL{
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();
        list.add("is");
        list.addFirst("a");
        list.addLast("dog");
        System.out.println(list);
        list.set(1,"cat");
        list.remove(1);
        System.out.println(list);
        list.size();
        list.removeFirst();
        System.out.println(list.size());

    }
}
