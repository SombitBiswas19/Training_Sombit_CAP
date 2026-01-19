package non_primitive_array;

public class EmployeeServiceImp implements EmployeeService{
	public Employee[] getHighSalaryEmployee(Employee[] employees,double minSalary)
	{
		Employee[] emp=new Employee[employees.length];
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].sal>minSalary)
			{
				emp[i]=employees[i];
			}
		}
		return emp;
	}
	public double calculateAverageSalary(Employee[] employees)
	{
		double sum=0;
		for(int i=0;i<employees.length;i++)
		{
			sum+=employees[i].sal;
		}
		return sum/employees.length;
	}
	
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee emp=employees[0];
		double maxi=employees[0].sal;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].sal>maxi)
			{
				maxi=employees[i].sal;
				emp=employees[i];
			}
		}
		return emp;
	}
	
	public Employee[] getExperiencedEmployees(Employee[] employees,int minyears)
	{
		Employee[] emp=new Employee[employees.length];
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].sal>minyears)
			{
				emp[i]=employees[i];
			}
		}
		return emp;
	}
	
	public Employee getTopPaidEmployeeByDepartment(Employee[] employees,String department)
	{
		Employee emp=employees[0];
		double maxi=employees[0].sal;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].sal>maxi && employees[i].department==department)
			{
				maxi=employees[i].sal;
				emp=employees[i];
			}
		}
		return emp;
	}
	
	public double getAverageSalaryByDepartment(Employee[] employees,String department)
	{
		double sum=0;
		int count_of_people_in_department=0;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].department==department)
			{
				sum+=employees[i].sal;
				count_of_people_in_department++;
			}
		}
		return sum/count_of_people_in_department;
	}
}
