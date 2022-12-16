package Department;

//import SuperInterface.ISuperClass;

public class SuperDepartment  {
	private String depName;
	private String todaysWork;
	private String workDeadline;
	private String todayAHoliday="Today is not a holiday";
	public SuperDepartment(String depName,String todaysWork,String workDeadline) {
		// TODO Auto-generated constructor stub
		this.depName= depName;
		this.todaysWork=todaysWork;
		this.workDeadline=workDeadline;

	}


	public String departmentName() {
		// TODO Auto-generated method stub

		return depName;
	}
	public void setdepartmentName(String depName) {
		this.depName=depName;
	}


	public String getTodaysWork() {

		return todaysWork;
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork=todaysWork;
	}


	public String getWorkDeadline() {

		return workDeadline;
	}
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline=workDeadline;
	}


	public String isTodayAHoliday() {

		return todayAHoliday;
	}
	//	public void setisTodayAHoliday(String todayAHoliday) {
	//		this.todayAHoliday=todayAHoliday;
	//	}


}
