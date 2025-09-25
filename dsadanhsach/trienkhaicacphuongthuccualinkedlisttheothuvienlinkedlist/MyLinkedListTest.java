package trienkhaicacphuongthuccualinkedlisttheothuvienlinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Danh sach sau khi them");
        list.printList();

        list.remove(2);
        System.out.println("Danh sach sau khi xoa chi so 2: ");
        list.printList();

        

    }
}
