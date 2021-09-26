
public class EmpWage {

public static void main(String[] args) {
// TODO Auto-generated method stub
		   int isFullTime=1;
		   int isPartTime=2;
		   int isAbsent=0;
		   int wageperhour=20;
		   int totalhours;
		   int wage=0;
		   int sumofsalary=0;
		   for (int i=0; i < 20; i++)
	       {
	       double attendance=Math.floor(Math.random()*10)%3;
	       int value = (int) attendance;
	       switch(value)
	       {
	       case 1:
	    	   totalhours=16;
	        	wage=wageperhour*totalhours;
	        	sumofsalary=sumofsalary+wage;
	        	break;
	       case 2:
	    	   totalhours=8;
	        	wage=wageperhour*totalhours;
	        	sumofsalary=sumofsalary+wage;
	        	break;
	       case 0:
	    	    sumofsalary=sumofsalary+wage;
	        	break;
	       }
	    }
		   System.out.println("Total Monthly Salary (20 days) which include parttime,fulltime and absence is:" + sumofsalary);
	}


}

