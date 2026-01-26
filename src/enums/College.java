package enums;

public class College {

	public enum Gender {
		M, F;
	}

	public enum StudentMode {
		ONLINE, OFFLINE;
	}

	public interface Staff {
		void work();
	}

	private class Student {
		private String name;
		private StudentMode mode;

		public Student(String name, StudentMode mode) {
			this.name = name;
			this.mode = mode;
		}

		public void display() {
			System.out.println("Student: " + name + " [" + mode + "]");
		}
	}

	private class Trainer implements Staff {
		private String name;

		public Trainer(String name) {
			this.name = name;
		}

		@Override
		public void work() {
			System.out.println("Trainer " + name + " is teaching.");
		}
	}

	
	public void Driver() {
		System.out.println("College");
		Student s1 = new Student("Sombit", StudentMode.ONLINE);
		Trainer t1 = new Trainer("Sandeep Sir");

		s1.display();
		t1.work();
	}

	public static void main(String[] args) {
		College myCollege = new College();
		myCollege.Driver();
	}
}
