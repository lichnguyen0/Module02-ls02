package trienkhaicacphuongthuccuaarraylisttheothuvien;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        System.out.println("Phần tử ở chỉ số 2: " + list.get(2));
        System.out.println("List contains 3: " + list.contains(3));
        System.out.println("Chỉ số 4: " + list.indexOf(4));
        list.remove(1);
        System.out.println("Phần tử 1 sau khi loại bỏ" + list.get(1));

        System.out.println("Size: " + list.size());

        list.clear();
        System.out.println("Kích thước sau khi xoá" + list.size());
    }
}
