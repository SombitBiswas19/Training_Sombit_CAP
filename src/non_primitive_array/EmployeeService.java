package non_primitive_array;


public interface EmployeeService {
	Employee[] getHighSalaryEmployee(Employee[] employees,double minSalary);
	
	double calculateAverageSalary(Employee[] employees);
	
	Employee getTopPaidEmployee(Employee[] employees);
	
	Employee[] getExperiencedEmployees(Employee[] employees,int minyears);
	
	Employee getTopPaidEmployeeByDepartment(Employee[] employees,String department);
	
	double getAverageSalaryByDepartment(Employee[] employee,String department);
}
