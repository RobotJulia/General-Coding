
public class LaunchExternal {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		try {
			runtime.exec("notepad.exe");
		}
		catch(Exception e) {
			System.out.println("whoops");
		}
	}
}
