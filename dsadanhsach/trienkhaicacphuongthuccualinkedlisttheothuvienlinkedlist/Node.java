package trienkhaicacphuongthuccualinkedlisttheothuvienlinkedlist;

public class Node {
    protected Node next;
    protected Object data;

    public Node (Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }
}
