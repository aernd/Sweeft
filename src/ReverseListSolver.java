public class ReverseListSolver {
    ListNode reverseList(ListNode head){
        if (head == null) return null;
        ListNode newHead = head;
        while(newHead.hasNext()){
            newHead = newHead.getNext();
        }
        reverseHelper(head);
        return newHead;
    }
    ListNode reverseHelper(ListNode head){
        if (!head.hasNext()) return head;
        ListNode next = reverseHelper(head.getNext());
        next.setNext(head);
        head.setNext(null);
        return head;
    }
}

class ListNode{
    private int value;
    private ListNode next;

    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean hasNext(){
        return next != null;
    }
    // Creates a linked list from given array and returns head
    // Made Testing easier
    public static ListNode linkedListFromArray(int[] arr){
        int n = arr.length;
        if (n == 0) return null;
        ListNode curHead = new ListNode(arr[n-1],null);
        for (int i = n-2; i >=0 ; i--) {
            curHead = new ListNode(arr[i], curHead);
        }
        return curHead;
    }
}