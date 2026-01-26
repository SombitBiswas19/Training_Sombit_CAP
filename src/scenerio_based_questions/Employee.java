package scenerio_based_questions;

abstract class Employee implements Payroll{
	private final int employee_id;
	private final String name;
	private final String role;
	private double salary;

	protected Employee(int employee_id, String name, String role, double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than zero.");
        }
        this.employee_id = employee_id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void updateSalary(double newSalary, String requesterRole) throws InvalidSalaryException {

        if (!"HR".equalsIgnoreCase(requesterRole)) {
            throw new UnauthorizedAccessException("Only HR is authorized to modify salary.");
        }

        if (newSalary <= 0) {
            throw new InvalidSalaryException("Invalid salary amount.");
        }

        this.salary = newSalary;
    }
    
    protected double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public String getEmployeeDetails() {
        return "ID: " + employee_id + ", Name: " + name + ", Role: " + role;
    }
}


