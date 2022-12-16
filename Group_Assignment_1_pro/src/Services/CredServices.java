package Services;

import Department.AdminDepartment;
import Department.HrDepartment;
import Department.SuperDepartment;
import Department.TechDepartment;
import Interface.IServices;

public class CredServices implements IServices {

	public CredServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showCredentials(SuperDepartment supD) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to "+supD.departmentName());
		System.out.println(supD.getTodaysWork());
		System.out.println(supD.getWorkDeadline());
		System.out.println(supD.isTodayAHoliday());
	}

	@Override
	public void showCredentials(AdminDepartment admD) {
		// TODO Auto-generated method stub 
//		Welcome to Admin Department
//		Complete your documents submission
//		Complete by EOD
//		Today is not a Holiday
		System.out.println("Welcome to "+admD.departmentName());
		System.out.println(admD.getTodaysWork());
		System.out.println(admD.getWorkDeadline());
		System.out.println(admD.isTodayAHoliday());
		

		

	}

	@Override
	public void showCredentials(HrDepartment hrD) {
		// TODO Auto-generated method stub
//		Welcome to HR Department
//		team Lunch
//		Fill today’s timesheet and mark your attendance
//		Complete by EOD
//		Today is not a Holiday
		
		System.out.println("Welcome to "+hrD.departmentName());
		System.out.println(hrD.doActivity());
		System.out.println(hrD.getTodaysWork());
		System.out.println(hrD.getWorkDeadline());
		System.out.println(hrD.isTodayAHoliday());

	}

	@Override
	public void showCredentials(TechDepartment techD) {
		// TODO Auto-generated method stub
//		Welcome to Tech Department
//		Complete coding of Module 1
//		Complete by EOD
//		Core Java
//		Today is not a Holiday
		
		System.out.println("Welcome to "+techD.departmentName());		
		System.out.println(techD.getTodaysWork());
		System.out.println(techD.getWorkDeadline());
		System.out.println(techD.getTechStackInformation());
		System.out.println(techD.isTodayAHoliday());

	}

}
