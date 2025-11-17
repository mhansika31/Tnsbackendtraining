package exceptiondemo;

public class MarksChecker {
	public void checkMarks(int marks) throws InvalidMarks {
		if(marks<0 || marks>100) {
			throw new InvalidMarks("Marks must be betweem 0 and 100");
		}
		else {
			System.out.println("Marks are valid: "+marks);
		}
	}

}
