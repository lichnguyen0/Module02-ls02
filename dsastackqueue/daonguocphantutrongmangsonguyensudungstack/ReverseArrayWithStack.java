package daonguocphantutrongmangsonguyensudungstack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu" + Arrays.toString(arr));

        Stack<Integer> stack = new Stack();

        //đưa phần tử arr vào stack
        for (int num : arr) {
            stack.push(num);
        }
        //lấy ra từ stack gán lại vào mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));
    }
}
