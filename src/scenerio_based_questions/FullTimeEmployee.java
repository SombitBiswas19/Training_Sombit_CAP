package scenerio_based_questions;

class FullTimeEmployee extends Employee {

	public FullTimeEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
		super(id, name, role, salary);
	}

	@Override
	public double calculatePay() {
		return getSalary();
	}

	@Override
	public double calculatePay(double bonus) {
		return getSalary() + bonus;
	}
}
