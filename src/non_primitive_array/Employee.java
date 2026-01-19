package non_primitive_array;

public class Employee {
	int id;
	String name;
	float sal;
	String department;
	int experience;
	public Employee(int id, String name, float sal,String department,int experience) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.department=department;
		this.experience=experience;
	}
	public static void main(String[] args) {
		Employee [] employees=new Employee[10];
		employees[0]=new Employee(1,"Ami",25000,"IT",5);
		employees[1]=new Employee(11,"Amii",28000,"IT",4);
		employees[2]=new Employee(12,"Amiii",55000,"IT",2);
		employees[3]=new Employee(13,"Amiiii",85000,"IT",7);
		employees[4]=new Employee(2,"Tui",30000,"CSE",4);
		employees[5]=new Employee(21,"Tuii",35000,"CSE",3);
		employees[6]=new Employee(22,"Tuiii",75000,"CSE",1);
		employees[7]=new Employee(3,"Se",20000,"ECE",3);
		employees[8]=new Employee(31,"See",25000,"ECE",6);
		employees[9]=new Employee(32,"Seee",44000,"ECE",7);
		EmployeeServiceImp imp=new EmployeeServiceImp();
		Employee [] highpaidemployees=imp.getHighSalaryEmployee(employees,25000);
		System.out.println("List of High paid Employees:");
		for(Employee emp:highpaidemployees)
		{
			if(emp!=null) {
			System.out.println("ID "+emp.id);
			System.out.println("Name: "+emp.name);
			System.out.println("Salary: "+emp.sal);
			System.out.println("Department:"+emp.department);
			System.out.println("Experience: "+emp.experience);
			System.out.println("--------------");
			}
		}
		System.out.println("==============");
		double avgsalary=imp.calculateAverageSalary(employees);
		System.out.println("Average salary is: "+avgsalary);
		System.out.println("==============");
		Employee top_paid_emp=imp.getTopPaidEmployee(employees);
		System.out.println("Top paid employee id "+top_paid_emp.id);
		System.out.println("Top paid employee name "+top_paid_emp.name);
		System.out.println("Top paid employee salary "+top_paid_emp.sal);
		System.out.println("Top paid employee department "+top_paid_emp.department);
		System.out.println("Top paid employee experience "+top_paid_emp.experience);
		System.out.println("==============");
		
		Employee[] getExperiencedEmployees=imp.getExperiencedEmployees(employees,2);
		System.out.println("Experienced Employee List:");
		for(Employee emp:getExperiencedEmployees)
		{
			if(emp!=null) {
				System.out.println("ID "+emp.id);
				System.out.println("Name: "+emp.name);
				System.out.println("Salary: "+emp.sal);
				System.out.println("Department:"+emp.department);
				System.out.println("Experience: "+emp.experience);
				System.out.println("--------------");
			}
		}
		System.out.println("==============");
		
		Employee top_paid_emp_by_department=imp.getTopPaidEmployeeByDepartment(employees,"IT");
		System.out.println("Top paid employee id of given department "+top_paid_emp_by_department.id);
		System.out.println("Top paid employee name of given department "+top_paid_emp_by_department.name);
		System.out.println("Top paid employee salary of given department "+top_paid_emp_by_department.sal);
		System.out.println("Top paid employee department of given department "+top_paid_emp_by_department.department);
		System.out.println("Top paid employee experience of given department "+top_paid_emp_by_department.experience);
		System.out.println("==============");
		
		double avgsalary_by_department=imp.getAverageSalaryByDepartment(employees,"CSE");
		System.out.println("Average salary by department is: "+avgsalary);
		System.out.println(avgsalary_by_department);
		System.out.println("==============");
	}
	
	
}
