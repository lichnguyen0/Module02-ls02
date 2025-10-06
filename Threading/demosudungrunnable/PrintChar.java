package demosudungrunnable;

public class PrintChar implements Runnable {
    private char CharToPrint;
    private int times;

    public PrintChar(char c, int t) {
        CharToPrint = c;
        this.times = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(CharToPrint);
        }
    }
}

class TaskThreadDemo{
    public static void main(String[] args) {
        //tạo hai runnable
        Runnable printA = new PrintChar('a',100);
        Runnable printB = new PrintChar('b',100);

        // Tạo thread từ runnable
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);

        // Khởi chạy
        thread1.start();
        thread2.start();
    }
}
