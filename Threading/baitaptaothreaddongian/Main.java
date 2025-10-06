package baitaptaothreaddongian;

public class Main {

NumberGenerator generator1 = new NumberGenerator();
NumberGenerator generator2 = new NumberGenerator();

Thread thread1 = new Thread(generator1, "Thread-1");
Thread thread2 = new Thread(generator2, "Thread-2");
}
