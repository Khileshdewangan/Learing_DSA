import java.util.Stack;

public class K_78_PalindromeLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int data){
            this.val = data;
            this.next = null;

        }
    }
    public static ListNode head;
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(s.size()>0){   //(!s.isEmpty())
            if(temp.val != s.pop()){
                return false;
            }else{
                temp = temp.next;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        ListNode newNode = new ListNode(1);
        head = newNode;
        newNode = new ListNode(2);
        head.next = newNode;
        newNode = new ListNode(3);
        head.next.next = newNode;
        newNode = new ListNode(2);
        head.next.next.next = newNode;
        newNode = new ListNode(1);
        head.next.next.next.next = newNode;
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

        System.out.println(isPalindrome(head));
    }
}
