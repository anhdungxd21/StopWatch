public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime();
        long start = stopWatch.startTime;
        System.out.println("Hellor World!");
        for (int i = 0; i < 1000000; i++) {
            System.out.print(i+"\t");
        }
        stopWatch.setEndTime();
        long end = stopWatch.endTime;

        System.out.println(end - start);

    }
}
