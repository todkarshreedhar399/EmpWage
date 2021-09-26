
public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int isPresent=1;
        double attendance=Math.floor(Math.random()*10)%2;
        if (attendance == isPresent)
        {
        	System.out.println("Employee is Present");
        }
        else 
        {
        	System.out.println("Employee is Absent");
        }
	}

}

