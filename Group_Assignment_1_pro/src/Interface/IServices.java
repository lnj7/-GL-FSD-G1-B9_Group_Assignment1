package Interface;

import Department.SuperDepartment;
import Department.AdminDepartment;
import Department.HrDepartment;
import Department.TechDepartment;
public interface IServices {
	public void showCredentials(SuperDepartment supD);
	public void showCredentials(AdminDepartment admD);
	public void showCredentials(HrDepartment hrD);
	public void showCredentials(TechDepartment techD);

}
