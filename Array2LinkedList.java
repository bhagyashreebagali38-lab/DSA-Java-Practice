class LL1{
    static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=null;
        }
    }
    public static void arr2Linked(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length();i++){
            Node mover.next=temp;
            Node mover=mover.next;
        }
        return head;

    }
    return head;
public static void main(String args[]){
        int arr[]={1,2,3,4};
        Node head=arr2Linked(arr[i]);
        System.out.print(head.data);
    }
}
