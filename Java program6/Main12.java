class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class Main12 {
    public static boolean isPalindrome(Node head) {
        if(head == null) return true;
        Node slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            Node temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        if(fast != null) slow = slow.next;
        while(prev != null) {
            if(prev.data != slow.data) return false;
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println(isPalindrome(head));  // true
    }
}