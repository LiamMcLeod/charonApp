import java.io.*;

public class Builder {
	
	private static void printLines(String name, InputStream ins) throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(
				new InputStreamReader(ins));
		while ((line = in.readLine()) != null) {
			System.out.println(name + " " + line);
		}
	}

	private static void runProcess(String command) throws Exception {
		Process pro = Runtime.getRuntime().exec(command);
		printLines("", pro.getInputStream());
		// printLines(command + " stderr:", pro.getErrorStream());
		pro.waitFor();
	}

	public static void main(String[] args) {
		try {
			runProcess("javac test/*");
			runProcess("java test/Main");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

