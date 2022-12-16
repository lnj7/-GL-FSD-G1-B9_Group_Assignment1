package Department;

public class TechDepartment extends SuperDepartment {

	public TechDepartment(String depName,String todaysWork,String workDeadline) {
		super(depName,todaysWork,workDeadline);
	}
		
	public String getTechStackInformation() {
		// TODO Auto-generated method stub
		String techStackInfo="core Java";
		return techStackInfo;
	}

}
