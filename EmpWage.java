
public class EmpWage {

public static void main(String[] args) {
// TODO Auto-generated method stub
		   public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static int computeEmpWage() {
         public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static int computeEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {

        //Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0: // Employee is absent
                    empHrs = 0;
                case 1: // FullTime Employee
                    empHrs = 8;
                    break;
                case 2: // PartTime Employee
                    empHrs = 4;
                    break;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Wages is : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("Dmart", 20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }


}

