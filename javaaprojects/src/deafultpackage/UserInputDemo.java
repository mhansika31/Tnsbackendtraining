package deafultpackage;
//Demo for Scanner
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your rollnumber: ");
		String rollnumber = sc.nextLine();
		System.out.println("Enter course:");
		String course = sc.nextLine();
		System.out.println("Enter number of days completed: ");
        int days=sc.nextInt();
        System.out.println(name + " (" + rollnumber + ") completed " + course + " in " + days + " days.");

        }

}
