package exceptiondemo;

public class WithExpectionhandling {

    public static void main(String[] args) {
        try {
            int x = 25;
            int y = 0;
            int divide = x / y;   // Will throw ArithmeticException
            System.out.println("Module result is " + divide);

            int arr[] = new int[3];
            arr[0] = 12;
            arr[1] = 23;
            arr[2] = 45;

            System.out.println(arr[4]);  // Will throw ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) {
            System.err.println("Error: Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Invalid array index");
        }
        finally {
            System.out.println("Thanks for visiting");
        }
    }
}

		
	
