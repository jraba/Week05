
public class AsterickLogger implements Logger {


	@Override
	public void log(String log) {
		String x = "*** ";
		String y = " ***";
		System.out.println(x + log + y);
	}

	@Override
	public void error(String error) {
		StringBuilder error1 = new StringBuilder(error);
		error1.append("***");
		System.out.println("******************");
		System.out.println("***ERROR: " + error1.toString());
		System.out.println("******************");
		
		
		
	}

		
	
}
