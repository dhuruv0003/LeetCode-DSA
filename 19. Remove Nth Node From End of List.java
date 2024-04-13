/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        // Write your code here.
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int nthfromstart=length-k-1;
        // i.e delete starting node
        if(nthfromstart==-1){
            return head.next;
        }
        Node prev=head;
        int i=0;
        while(i<nthfromstart){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
