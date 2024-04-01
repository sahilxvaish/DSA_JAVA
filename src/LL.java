import java.lang.instrument.IllegalClassFormatException;

class LL {
    private Object data;

    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    //add first, last.

     public void addFirst(String data){
        Node newNode = new Node(data);
         Node head = null;
         if(head == null ){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }

     //add last
     public void addLast (String data){
         Node newNode = new Node(data);
         Node head = null;
         if(head == null ){
             head = newNode;
             return;
         }
         Node currNode = head;
         while(currNode.next != null){
             currNode = currNode.next;
         }
         currNode.next = newNode;

     }

     //print
     public void printList(){
         Node head = null;
         if (head == null) {
             System.out.println("list is empty");
             return;
         }
         Node currNode = head;
         while(currNode.next != null){
             Node data;
             System.out.println(currNode- data + "->");
             currNode = currNode.next;
         }

         System.out.println("NULL");

     }
     }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");


    }
}
