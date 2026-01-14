package inheritance;

public class WhatsApp extends App {
	float version;
	String app_type;
	WhatsApp(float version,String app_type,float app_size,float rating)
	{
		this.version=version;
		this.app_type=app_type;
		this.app_size=app_size;
		this.rating=rating;
	}
	public static void main(String[] args) {
		WhatsApp wp= new WhatsApp(1.0f,"Msg Sending",25f,4.9f);
		System.out.println(wp.app_size);
		System.out.println(wp.app_type);
		System.out.println(wp.rating);
		System.out.println(wp.version);

	}

}
