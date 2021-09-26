
public class EmpWage {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int isPresent=1;
		   int wageperhour=20;
		   int totalhours=8;
		   int wage=0;
	        double attendance=Math.floor(Math.random()*10)%2;
	        if (attendance == isPresent)
	        {
	        	System.out.println("Employee is Present");
	        	wage=wageperhour*totalhours;
	        	System.out.println("Full Time Day Wage:"+ wage);
	        	
	        }
	        else 
	        {
	        	System.out.println("Employee is Absent");
	        	System.out.println("Full Time Day Wage:"+ wage);
	        	
	        }
	}


}

