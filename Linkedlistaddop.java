class LL{
    Node head;
    class Node{
        Integer data;
        Node next;
        Node(Integer data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(Integer data){
        Node newnode=new Node(data);
        if(head==null){
         head=newnode;
         return;
        }
        newnode.next=head;
        head=newnode;
    }
    //add last
    public void addLast(Integer data){
        Node newnode=new Node(data);
        if(head==null){
         head=newnode;
         return;
        }
        if(head==null){
        System.out.println("list empty");
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newnode;
    }
        public void printlist(){
        if(head==null){
        System.out.println("list empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(1);
        list.addFirst(5);
        list.addLast(7);
        list.printlist();
        list.addFirst(8);
        list.printlist();
    }
}
