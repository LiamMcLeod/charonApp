import java.util.*;

public class Charon {
	public static Scanner input = new Scanner(System.in);
	private ArrayList<JavaLine> program = new ArrayList<>();

	public static void main( String args[] ){
		( new Charon() ).process();
	}

	private void process(){
		readProgram();
		printProgram();
	}

	private void readProgram(){

		while (input.hasNextLine()){
			String strLine = input.nextLine();
			program.add( new JavaLine( strLine ) );
			if (strLine.equals("#####")){
				break; 
			}
		}

	}

	private void printProgram(){
		for ( JavaLine strLine: program ){
			System.out.println(strLine.returnLine());
		}
	}
}
