package linkedlist;

public class Linkedlist {
    private Node head;
    private int size;

    public Linkedlist() {
        this.head = null;
        this.size = 0;
    }

    public Linkedlist(Node head, int size) {
        this.head = head;
        this.size = size;
    }


    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else
            return false;
    }

    public int getSize() {
        return size;
    }

    public void insertAtFirst(int value) {
        Node n = new Node();
        n.setData(value);
        n.setNext(head);
        head = n;
        size++;
    }

    public void insertAtLast(int value) {
        Node n = new Node();
        Node temp;
        n.setData(value);
        temp = head;
        if (temp == null) {
            head = n;
        } else {

            while (temp.getNext() != null) {
                temp = temp.getNext();
                temp.setNext(n);

            }
        }
        size++;
    }

    public void insertAtPos(int val, int pos) {
        if (pos == 1) {
            insertAtFirst(val);
        } else if (pos == size + 1) {
            insertAtLast(val);
        } else if (pos > 1 && pos <= size) {
            Node n = new Node(val, null);
            Node temp;
            temp = head;//temp will point to the first node
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getNext();
                n.setNext(temp.getNext());
                temp.setNext(n);
                size++;
            }

        } else {
            System.out.println("insertion not possible at the given position " + pos);
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");

        } else {
            head = head.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");

        } else if (size == 1) {
            head = null;
            size--;

        } else {
            Node temp;
            temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.getNext();
                temp.setNext(null);
                size--;
            }
        }
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("list is empty");

        } else if (pos < 1 || pos > size) {

            System.out.println("Invalid position");
        } else if (pos == 1) {
            deleteFirst();
        } else if (pos == size) {
            deleteLast();
        } else {
            Node temp, temp1;
            temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getNext();
                temp1 = temp.getNext();
                temp.setNext(temp1.getNext());
                size--;
            }
        }

    }

    public void printList() {
        System.out.println("mylist:");
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + "--->");
                temp = temp.getNext();
            }
            System.out.println("null");

        }
    }

    public boolean search(Node head, int x) {

        while (head != null) {
            if (head.getData() == x)
                return true;
            head = head.getNext();
        }
        return false;
    }

}
