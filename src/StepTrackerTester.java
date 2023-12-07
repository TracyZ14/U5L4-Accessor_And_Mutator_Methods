public class StepTrackerTester
{
    public static void main(String[] args)
    {
        StepTracker tr = new StepTracker(10000);

        System.out.println("EXPECTED RESULT : 0");
        System.out.println("ACTUAL RESULT   : " + tr.activeDays());
        System.out.println();

        System.out.println("EXPECTED RESULT : 0.0");
        System.out.println("ACTUAL RESULT   : " + tr.averageSteps());
        System.out.println();

        tr.addDailySteps(9000);

        tr.addDailySteps(5000);

        System.out.println("EXPECTED RESULT : 0");
        System.out.println("ACTUAL RESULT   : " + tr.activeDays());
        System.out.println();

        System.out.println("EXPECTED RESULT : 7000.0");
        System.out.println("ACTUAL RESULT   : " + tr.averageSteps());
        System.out.println();

        tr.addDailySteps(13000);

        System.out.println("EXPECTED RESULT : 1");
        System.out.println("ACTUAL RESULT   : " + tr.activeDays());
        System.out.println();

        System.out.println("EXPECTED RESULT : 9000.0");
        System.out.println("ACTUAL RESULT   : " + tr.averageSteps());
        System.out.println();

        tr.addDailySteps(23000);

        tr.addDailySteps(1111);

        System.out.println("EXPECTED RESULT : 2");
        System.out.println("ACTUAL RESULT   : " + tr.activeDays());
        System.out.println();

        System.out.println("EXPECTED RESULT : 10222.2");
        System.out.println("ACTUAL RESULT   : " + tr.averageSteps());
    }
}