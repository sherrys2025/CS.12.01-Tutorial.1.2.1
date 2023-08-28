import static java.lang.Math.max;

public class StepTracker {

    private int totalDay;
    private int activeDay;
    private int totalSteps;
    private int activeCountSteps;

    private int activeSteps;

    public StepTracker(int activeSteps){
        totalDay = 0;
        totalSteps = 0;
        activeDay = 0;
        this.activeSteps = activeSteps;
    }

    public int activeDays(){
        return activeDay;
    }

    public void addDailySteps(int s){
        totalSteps += s;
        totalDay++;
        if (s >= activeSteps) {
            activeDay++;
        }
    }

    public double averageSteps(){
        return totalSteps/max(totalDay, 1);
    }

    public int getDays(){
        return totalDay;
    }

    public int getStepsForActiveDay(){
        return activeSteps;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public int getActiveDays() {
        return activeDay;
    }
}
