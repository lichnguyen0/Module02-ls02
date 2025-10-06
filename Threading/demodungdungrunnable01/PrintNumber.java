package demodungdungrunnable01;

public class PrintNumber implements Runnable {
    private int number;

    public PrintNumber(int n) {
        number = n;
    }

    @Override
    public void run() {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);

            //ví dụ sử dụng các phương thức quản lý vòng đời
            //minh ho sử dụng sleep
            try{
                Thread.sleep(100);// nghỉ 100ms
            }catch(InterruptedException e){
                System.out.println(" Lỗi" + e.getMessage());
            }
        }
    }
}

class PrintLetter implements Runnable {
    private char from;
    private char to;

    public PrintLetter(char from, char to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (char i = from; i <= to; i++) {
            System.out.println(i);
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
// cách khởi tạo tách riêng Runnnable trước, rồi new Thread
        Runnable printnum = new PrintNumber(50);
        Runnable printletter = new PrintLetter('A', 'Z');
        Runnable printCurrent = new PrintCurrent("Hello Thread!", 30);

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
