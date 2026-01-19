package interface_implementation;

public class Person {
	private Vehicle v; //HAS-A Relationship user creates object at runtime Person has vehicle
	//desn't denotes exactly one vehicle

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	
}
