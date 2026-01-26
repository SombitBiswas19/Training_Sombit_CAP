package collection_framework;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> student=new ArrayList<Student>();
		
		student.add(new Student(1,"Angur",87.67));
		student.add(new Student(2,"Angur1",70.98));
		student.add(new Student(3,"Angur2",56.23));
		
		System.out.println(student);
		
		for(int i=0;i<student.size();i++)
		{
			System.out.println(student.get(i).id);
			System.out.println(student.get(i).name);
		}
		for(Student s:student)
		{
			System.out.println(s.id);
			System.out.println(s.name);
		}
		
		
		System.out.println("=========================================");
		
		ArrayList<Employee> employee=new ArrayList<Employee>();
		
		employee.add(new Employee(1,"sombioo","Developer",590797));
		employee.add(new Employee(1,"sombiooo","HR",290797));
		employee.add(new Employee(1,"sombioooo","Tech",390797));
		employee.add(new Employee(1,"sombiooooo","Developer",990797));
		
		
		
		List<Employee>emp=findEmpByDep(employee,"HR");
		for(Employee e:emp)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.department);
			System.out.println(e.salary);
		}
		
		System.out.println("==================");
		
		emp=findEmpBySal(employee,500000);
		for(Employee e:emp)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.department);
			System.out.println(e.salary);
		}
		
	}
	
	public static List<Employee> findEmpByDep(List<Employee>employee,String dep){
		List<Employee> employee_temp=new ArrayList<Employee>();
		for(Employee e:employee)
		{
			if(e.department==dep)
			{
				employee_temp.add(e);
			}
		}
		return employee_temp;
	}
	public static List<Employee> findEmpBySal(List<Employee>employee,double sal){
		List<Employee> employee_temp=new ArrayList<Employee>();
		for(Employee e:employee)
		{
			if(e.salary>=sal)
			{
				employee_temp.add(e);
			}
		}
		return employee_temp;
	}
}
