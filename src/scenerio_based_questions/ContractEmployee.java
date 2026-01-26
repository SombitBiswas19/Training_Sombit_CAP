package scenerio_based_questions;

class ContractEmployee extends Employee {

	private final int hours_worked;
	private final double hour_Rate;

	public ContractEmployee(int id, String name, String role, double hour_Rate, int hours_worked) throws InvalidSalaryException {

		super(id, name, role, hours_worked * hours_worked);

		if (hour_Rate <= 0 || hours_worked <= 0) {
			throw new InvalidSalaryException("Invalid contract pay configuration.");
		}

		this.hour_Rate = hour_Rate;
		this.hours_worked = hours_worked;
	}

	@Override
	public double calculatePay() {
		return hour_Rate * hours_worked;
	}
	
	@Override
	public double calculatePay(double incentive) {
		return (hour_Rate * hours_worked) + incentive;
	}
}
