public class CompanyEmpWage {
    //variables
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maximumHoursPerMonth;
    public int totalWage;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
        //Constructor
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maximumHoursPerMonth = maximumHoursPerMonth;
    }
    public void setTotalEmpWage(int totalWage){
        this.totalWage=totalWage;
    }
    public String toString() {
        return "Total Employee Wage for "+company+" is "+totalWage;
    }
}

