class Palindrome{
    public Nodelist getMiddle(Nodelist head){
        Nodelist fast=head;
        Nodelist slow=head;
        while(head.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        reurn slow;
    }
    public Nodelist reverse(Nodelist head){
        Nodelist prev=null;
        Nodelist cur=head;
        while(cur!=null){
            NodeList next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=cur.next;
        }
        return prev;
    }
    public boolean void palindrome(Nodelist head){
        if(head==null || head.next==null){
            return true;
        }
        Nodelist firstend=getMiddle(head);
        Nodelist secondstsrt=reverse(firstend.next);
        Nodelist firststart=head;
        while(secondstsrt.next!=null){
            if(secondstsrt!==firststart){
                return false;
            }
            secondstsrt=secondstsrt.next;
            firststart=firststart.next;
        }
        return true;
    }
}
