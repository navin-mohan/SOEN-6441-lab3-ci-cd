public class GenericList<T> {
    class Node {
        T val;
        Node next = null;

        Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public T getVal() {
            return val;
        }

        public void setVal(T val) {
            this.val = val;
        }
    }

    Node head = null;

    public void append(T val) {
        if (this.head == null) {
            this.head = new Node(val, null);
            return;
        }

        Node cur = head;
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }

        cur.setNext(new Node(val, null));
    }

    public void delete() {
        if (head == null) {
            return;
        }

        if (head.getNext() == null) {
            head = null;
            return;
        }

        Node cur = head;
        while (cur.getNext() != null && cur.getNext().getNext() != null) {
            cur = cur.getNext();
        }

        cur.setNext(null);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if (head == null) {
            sb.append("EMPTY LIST\n");
            return sb.toString();
        }

        Node cur = head;

        sb.append("List start:\n");
        int i = 0;

        while (cur != null) {
            sb.append("Item " + i + " : " + cur.getVal() + "\n");
            i++;
            cur = cur.getNext();
        }

        sb.append("List end\n");

        return sb.toString();
    }
}
