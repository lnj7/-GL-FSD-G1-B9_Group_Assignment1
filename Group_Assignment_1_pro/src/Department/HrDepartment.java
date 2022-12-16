package Department;

public class HrDepartment extends SuperDepartment {	

	public HrDepartment(String depName,String todaysWork,String workDeadline) {
		super(depName,todaysWork,workDeadline);

	}
	
	public String doActivity() {
		// TODO Auto-generated method stub
		String doActivity="team Lunch";
		return doActivity;
	}

}
