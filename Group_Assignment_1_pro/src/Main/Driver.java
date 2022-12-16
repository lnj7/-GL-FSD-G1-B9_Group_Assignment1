package Main;
import java.util.Scanner;

import Department.SuperDepartment;
import Department.AdminDepartment;
import Department.HrDepartment;
import Department.TechDepartment;
import Interface.IServices;
import Services.CredServices;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		SuperDepartment supDep=new SuperDepartment("Super Department","No Work as of now","nil");

		AdminDepartment admDep=new AdminDepartment("Admin Department","Complete your documents Submission","Complete by EOD");
		HrDepartment hrDep=new HrDepartment("HR Department","Fill today’s timesheet and mark your attendance","Complete by EOD");	
		TechDepartment techDep=new TechDepartment("Tech Department","Complete coding of Module 1","Complete by EOD");

		IServices service = new CredServices();

		int check=0;
		System.out.println("Enter the operation number for the department");
		System.out.println("1. Admin");
		System.out.println("2. Human Resource");
		System.out.println("3. Technical");
		System.out.println("4. Exit");


		while(check!=4)
		{
			int option;
			option = scanner.nextInt();



			switch (option)
			{
			case 1:
			{
				service.showCredentials(admDep); 

				break;
			}
			case 2:
			{
				service.showCredentials(hrDep); 
				break;
			}
			case 3:
			{
				service.showCredentials(techDep); 
				break;
			}
			case 4:
			{
				//						service.showCredentials(supDep);
				System.out.println("Exited");

				break;
			}

			default:
			{
				System.out.println("Enter a valid option");
			}
			}
			check++;
		}
		scanner.close();


	}

}
