package baitaptaothreaddongian;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName()
                        + "| Number: " + i
                        + "| HashCOde: " + this.hashCode());

                //nghi 500ms
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + "Bị gián đoạn");
        }
    }
}
