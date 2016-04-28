
public class JavaLine {

	private String line="";		// Java Code

	public JavaLine(String strLine){
		// LINE ANALYSIS IF NECESSARY
		line=strLine;
	}

	public String returnLine(){
		if (line.equals("#####"))
			return "";	
		else
			return line;
	}

	public String toString(){
		return "JavaLine(String strLine)";
	}	
}