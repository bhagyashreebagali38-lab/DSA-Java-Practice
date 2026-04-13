import java.util.ArrayList;
import java.util.Collections;
class Pract{
    public static void main(String args[]){
        ArrayList<Integer> ll=new ArrayList<Integer>();
        ll.add(10);
        ll.add(12);
        ll.add(5);
        System.out.println(ll); 
        Collections.reverse(ll);
        System.out.println(ll);
        Collections.sort(ll);
        int seconedlarge=ll.get(ll.size()-2);
        System.out.println(seconedlarge);

    }
}
