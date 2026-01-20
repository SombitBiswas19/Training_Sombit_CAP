package singleton_class_creation;

public class FiveDBObjectCreation {

    private static final int maxi= 5;
    private static int count = 0;

    private FiveDBObjectCreation() {
        System.out.println("Connection established. Current active connections: " + (count));
    }

    public static FiveDBObjectCreation getConnection() {
        if (count < maxi) {
        	FiveDBObjectCreation connection = new FiveDBObjectCreation();
            count++;
            return connection;
        } else {
            System.out.println("Connection limit reached. Cannot create more connections.");
            return null;
        }
    }

    public static int getActiveConnectionCount() {
        return count;
    }
	
}
