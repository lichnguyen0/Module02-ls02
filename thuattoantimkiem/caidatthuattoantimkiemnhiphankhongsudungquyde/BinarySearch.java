package caidatthuattoantimkiemnhiphankhongsudungquyde;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;   // lấy vị trí giữa
            if (key < list[mid]) {        // nếu key nhỏ hơn phần tử giữa.
                high = mid - 1;           // dịch phạm vi sang bên trái
            } else if (key > list[mid]) { // nếu key lớn hơn phần tử giữa
                low = mid + 1;            // dịch phạm vi sang bên phải
            } else {                      // nếu key == list[mid]
                return mid;               // trả về giá trị tìm thấy
            }
        }
        return -1;  //không tìm thấy.
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
