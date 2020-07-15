
public class SpacedLogger implements Logger {
	

	@Override
	public void log(String log) {
		StringBuilder log1 = spaceString(log);
		System.out.println(log1);
	
	}

	@Override
	public void error(String error) {
		StringBuilder error1 = spaceString(error);
		System.out.println("ERROR: " + error1);
	
	}
	
	public static StringBuilder spaceString(String x) {
		StringBuilder result = new StringBuilder();

		for(int i = 0 ; i < x.length(); i++)
		{
		   result = result.append(x.charAt(i));
		   if(i == x.length()-1)
		      break;
		   result = result.append(' ');
		}
		return result;
	}

}
