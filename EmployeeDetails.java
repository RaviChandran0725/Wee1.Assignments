package assignments;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee Name : "+empName +"   " + "Employee ID : "+empId);
		
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee Address : "+empAddress);
		
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee Salary : "+empSalary);
		
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Employee Mobile : "+mobNum);
		
	}

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		employee.printEmployeeName("Ravichandran", 7);
		employee.getEmployeeAddress("Vellore");
		employee.printEmployeeSalary(25000);
		employee.printEmployeeMobileNumber(1234567890l);

	}

}
