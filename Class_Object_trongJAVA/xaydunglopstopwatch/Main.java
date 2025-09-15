package xaydunglopstopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();

        sw.start();// bắt đầu đo thời gian

        //giả lập lặp để tiêu tốn thời gian
        for(long i = 0; i< 100_000_000L; i++){
            Math.sqrt(i);// tính căn bậc 2 để ngốn cpu
        }

        sw.stop();// kết thúc đo thời gian

        System.out.println("Thời gian thực thi: "+sw.getElapsedTime()+"ms");
    }
}
