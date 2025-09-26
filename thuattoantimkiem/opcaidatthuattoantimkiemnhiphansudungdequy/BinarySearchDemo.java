package opcaidatthuattoantimkiemnhiphansudungdequy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //b1
        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        //sắp xếp thứ tự tăng tắng dần
        Arrays.sort(arr);
        System.out.println("Mảng sâu khi sắp xếp: " + Arrays.toString(arr));

        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, value);

        if (result != -1) {
            System.out.println("Tìm thấy giá trị " + value + " tại vị trí: " + result);
        } else {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng");
        }
        scanner.close();
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            }

            if (value > array[middle]) {
                left = middle + 1;
            }
            // Bước 7: value < array[middle] - tìm ở phía bên trái
            else {
                right = middle - 1;
            }

        }
        return -1;
    }
}
