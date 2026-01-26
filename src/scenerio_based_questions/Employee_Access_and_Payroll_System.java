package scenerio_based_questions;

public class Employee_Access_and_Payroll_System {
	public static void main(String[] args) {

        try {
            Employee emp1 = new FullTimeEmployee(1, "Sombit", "HR", 60000);
            Employee emp2 = new ContractEmployee(2, "Sombit1", "Developer", 50, 160);
            System.out.println(emp1.getEmployeeDetails());
            System.out.println("Monthly Pay: " + emp1.calculatePay(5000));
            System.out.println("+++++++++++++++");
            System.out.println(emp2.getEmployeeDetails());
            System.out.println("Contract Pay: " + emp2.calculatePay());
            System.out.println("+++++++++++++++");
            emp1.updateSalary(65000, "HR");
            emp2.updateSalary(70000, "Developer");

        } catch (InvalidSalaryException e) {
            System.out.println("Salary Error");

        } catch (UnauthorizedAccessException e) {
            System.out.println("Access Denied");
        }
    }
}
