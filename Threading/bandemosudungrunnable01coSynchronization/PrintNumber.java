package bandemosudungrunnable01coSynchronization;


//bài code này giống hệt bài code trong package demodungdungrunnable01
// nhưng con này khác ở chỗ đã sử dụng Đồng bộ hoá (Synchronization)
// đem xem so sánh với bài code gốc để hiểu cách sử dụng Đồng bộ hoá (Synchronization)

class ShareLock {}// tạo đối tượng dùng chung

public class PrintNumber implements Runnable {
    private int number;
    private ShareLock lock;

    public PrintNumber(int n, ShareLock lock) {
        number = n;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i <= number; i++) {
                System.out.println(i);

                //ví dụ sử dụng các phương thức quản lý vòng đời
                //minh ho sử dụng sleep
                try {
                    Thread.sleep(100);// nghỉ 100ms
                } catch (InterruptedException e) {
                    System.out.println(" Lỗi" + e.getMessage());
                }
            }
        }
    }
}

class PrintLetter implements Runnable {
    private char from;
    private char to;
    private ShareLock lock;

    public PrintLetter(char from, char to,  ShareLock lock) {
        this.from = from;
        this.to = to;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (char i = from; i <= to; i++) {
                System.out.println(i);
            }
        }
    }
}

class PrintCurrent implements Runnable {
    private String message;
    private int time;

    public PrintCurrent(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i <= time; i++) {
            System.out.println(message);
        }
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        ShareLock lock = new ShareLock(); // tạo đối tượng chung

// cách khởi tạo tách riêng Runnnable trước, rồi new Thread
        Runnable printnum = new bandemosudungrunnable01coSynchronization.PrintNumber(50, lock);
        Runnable printletter = new bandemosudungrunnable01coSynchronization.PrintLetter('A', 'Z', lock);
        Runnable printCurrent = new bandemosudungrunnable01coSynchronization.PrintCurrent("Hello Thread!", 30);

        Thread thread1 = new Thread(printnum);
        Thread thread2 = new Thread(printletter);
        Thread thread3 = new Thread(printCurrent);


        thread1.start();
        thread2.start();
        thread3.start();


        // đây là cách tạo đối tượng trực tiếp gộp lại.

        /*Thread t1 = new Thread(new PrintNumber(50));
        Thread t2 = new Thread(new PrintLetter('A', 'Z'));
        Thread t3 = new Thread(new PrintCurrent("Hello Thread!", 30));

        // Khởi động các thread
        t1.start();
        t2.start();
        t3.start();*/
    }
}
