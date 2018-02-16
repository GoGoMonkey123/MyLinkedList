public class MyLinkedList {
    ListNode head;
    ListNode tail;
    int length;
    class ListNode{
        public ListNode(int val){
            this.val=val;
        }
        int val;
        ListNode next;
    }

    public MyLinkedList(){
        head=new ListNode(0);
        tail=head;
        length=0;
    }
    public void add(int val){
        tail.next=new ListNode(val);
        tail=tail.next;
        length++;
    }
    public void add(int val,int index){

    }
    public int len(){
        return length;
    }
    public void delete(int index){

    }
    public void print() {
        ListNode runner = head;
        while (runner != null) {
            System.out.print(runner.val);
            runner = runner.next;
        }
    }

    public static void main(String[] args){
        MyLinkedList TestList=new MyLinkedList();
        TestList.add(1);
        TestList.add(2);
        TestList.add(3);
        TestList.len();
        TestList.print();
    }
}
