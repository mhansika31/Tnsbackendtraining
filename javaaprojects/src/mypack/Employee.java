package mypack;

public class Employee {
	String sname;
    int id;
    double salary;
    static String companyName = "TechCorp Pvt Ltd";

    void display() {
        String message = "These are Employee details:";
        System.out.println(message + " Company: " + companyName + " Name: " + sname + " ID: " + id + " Salary: ₹" + salary);
    }

}
