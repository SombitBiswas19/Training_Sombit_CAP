package interface_implementation;

public class Driver_CPU {

	public static void main(String[] args) {
		Computer comp=new Computer();
		comp.setC(new IntelCPU());
		CPU c=comp.getC();
		c.CPU_type();
		comp.setC(new AMD_CPU());
		CPU c1=comp.getC();
		c1.CPU_type();
	}

}
