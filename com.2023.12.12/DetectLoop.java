package Day3;
class Nodes
{
    int data;
    Nodes next;
    Nodes(int d) {data = d; next = null; }
}
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Nodes head){
        // Add code here
        Nodes fast = head;
        Nodes slow = head;
        while(fast != null && slow != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}