public class TimeExecution {

    public static void main(String[] args) throws InterruptedException {
        //start
        long startMillis = System.currentTimeMillis();
        long startNano = System.nanoTime();

        //suspend for 1000ms
        Thread.sleep(1000);

        //stop
        long stopMillis = System.currentTimeMillis();
        long stopNano = System.nanoTime();

        // time between start and stop
        long durationMillis = stopMillis - startMillis;
        long durationNano = stopNano - startNano;

        System.out.println("Execution took " + durationMillis + " milliseconds");
        System.out.println("Execution took " + durationNano + " nanoseconds");


    }
}
