public class StepTracker
{
    private int minimumSteps;
    private int totalSteps;
    private int daysDataEntered;
    private int activeDays;

    public StepTracker(int minimumSteps)
    {
        this.minimumSteps = minimumSteps;
        this.totalSteps = 0;
        this.daysDataEntered = 0;
        this.activeDays = 0;
    }

    public void addDailySteps(int steps)
    {
        if(steps >= minimumSteps)
        {
            activeDays++;
        }
        totalSteps = totalSteps + steps;
        daysDataEntered++;
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        return((double) totalSteps / daysDataEntered);
    }
}