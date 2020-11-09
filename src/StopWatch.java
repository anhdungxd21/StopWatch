import java.util.Date;

public class StopWatch {
    long startTime, endTime;

    public void setStartTime(){
        startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        endTime = System.currentTimeMillis();
    }
}
