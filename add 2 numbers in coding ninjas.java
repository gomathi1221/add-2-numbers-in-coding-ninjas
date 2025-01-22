public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode res=new LinkedListNode(0);
        LinkedListNode d=res;
        int carry=0;
        int c=0,g=0;
        while(head1!=null||head2!=null){
            if(head1!=null){
                 c=head1.data;
                 head1=head1.next;
            }
            else{
                c=0;
            }
           
            if(head2!=null){
                 g=head2.data;
                 head2=head2.next;
            }
            else{
                g=0;
            }
            int sum=c+g+carry;
            carry=sum/10;
            d.next=new LinkedListNode(sum%10);
            d=d.next;
           

        }
        if(carry>0){
            d.next=new LinkedListNode(carry);
            d=d.next;
        }
        return res.next;

    
    }
}