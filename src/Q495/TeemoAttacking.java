package Q495;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {


        int lastPoisonedTime = 0;
        int totalTime = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] < lastPoisonedTime) {
                totalTime += timeSeries[i] + duration - lastPoisonedTime;
                lastPoisonedTime = Math.max(timeSeries[i] + duration, lastPoisonedTime);
            } else {
                totalTime += duration;
                lastPoisonedTime = timeSeries[i] + duration;
            }
        }
        return totalTime;

    }
}
