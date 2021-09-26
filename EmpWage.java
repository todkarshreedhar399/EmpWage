
public class EmpWage {

public static void main(String[] args) {
// TODO Auto-generated method stub
 public static final int isPartTime=0;
    public static final int isFullTime=1;
    private int numOfCompany;
    private CompanyEmpWage empWageArray[];

    public EmployeeWage() {
        empWageArray=new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth) {
        empWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage() {
        for(int i=0;i<numOfCompany;i++) {
            empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
            System.out.println(empWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHours=0, totalEmpHours=0, totalWorkingDays=0;
        while(totalEmpHours<=companyEmpWage.maximumHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
            int check=(int)(Math.floor(Math.random()*10)%2);
            switch(check){
                case isPartTime:
                    empHours=4;
                    break;
                case isFullTime:
                    empHours=8;
                    break;
                default :
                    empHours=0;
            }
            totalEmpHours+=empHours;
            totalWorkingDays+=1;
        }
        return totalEmpHours * companyEmpWage.empRatePerHour;

    }
    public static void main(String args[]) {
        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.addCompanyEmpWage("Dmart", 15, 21, 80);
        employeeWage.addCompanyEmpWage("Reliance", 15, 22, 100);
        employeeWage.computeEmpWage();

    }


}

