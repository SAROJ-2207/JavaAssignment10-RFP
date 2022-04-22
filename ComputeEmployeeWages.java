public class ComputeEmployeeWages {

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int WAGE_PER_HR=20;
    public static final int MAX_WORKING_DAYS=20;
    public static final int MAX_HR_IN_MONTH=100;

    public static void main(String arg[]) {
        int totalWage=0;
        int totalWorkingDays=0;
        int totalHr=0;

        System.out.println("Welcome to the Employee Wage computation program.");

        while (totalWorkingDays<MAX_WORKING_DAYS && totalHr<MAX_HR_IN_MONTH) {
                int empHr = 0;
                totalWorkingDays++;
                int checkEmp = (int) (Math.random() * 3);

                switch (checkEmp) {
                    case IS_FULL_TIME:
                        empHr = 8;
                        break;
                    case IS_PART_TIME:
                        empHr = 4;
                        break;
                    default:
                        empHr = 0;
                }
                totalHr += empHr;

                int dailyWage = empHr * WAGE_PER_HR;
                System.out.println("Daily Wage =" + dailyWage);

        }
        totalWage=totalHr*WAGE_PER_HR;
        System.out.println("Total wage for month = "+totalWage);
    }
}