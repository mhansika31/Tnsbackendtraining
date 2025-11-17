package exceptiondemo;

public class MarksMain {

    public void checkMarks(int marks) throws InvalidMarks {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarks("Marks must be between 0 and 100");
        }
        else {
            System.out.println("Valid Marks: " + marks);
        }
    }
}
