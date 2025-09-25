package trienkhaicacphuongthuccualinkedlisttheothuvienlinkedlist;


public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp.next = temp.next.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        numNodes++;
    }

    //them phan tu vao dau danh sach
    public void addFirst(E element) {
        add(0, element);
    }

    public void addLast(E element) {
        add(numNodes, element);
    }

    //Xoa phan tu ơ index
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removed = temp.next;
            temp.next = removed.next;
        }
        numNodes--;
        return (E) removed.data;
    }

    //Xoa phan tu theo gia tri
    public boolean remove(Object o) {
        if (head == null) return false;

        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }
        return false;
    }

    //tra ve kich thuoc danh sach
    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            cloneList.addLast((E) temp.data);
            temp = temp.next;
        }
        return cloneList;
    }

    //kiem tra phan tu có trong danh sach không.
    public boolean contains(E o) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) return true;
            temp = temp.next;
        }
        return false;
    }

    //tra ve vi tri phan tu
    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    //them vao cuoi danh sach (giong addlast)
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
    }

    //lay phan tu tai vi tri i
    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    //Lay phan tu dau tien
    public E getfirst() {
        if (head == null) return null;
        return (E) head.data;
    }

    //lay phan tu cuoi cung
    public E getlast() {
        if (head == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    //xoa toan bo danh sach
    public void clear() {
        head = null;
        numNodes = 0;
    }

    //in danh sach
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
