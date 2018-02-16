public class MyLinkedList {
    Node head;
    Node tail;
    int length;
    class Node{
        public Node(int val){
            this.val=val;
        }
        int val;
        Node next;
    }

    public MyLinkedList(){
        head=new Node(0);
        tail=head;
        length=0;
    }
    public void add(int val){
        tail.next=new Node(val);
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
        Node runner = head;
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
