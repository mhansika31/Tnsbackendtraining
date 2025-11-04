package mypack;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
       
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        //Relational Operators
        
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        //Logical Operators
       
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        //Assignment Operators
       
        int c = 5;
        System.out.println("Initial c: " + c);
        c += 3;  
        System.out.println("After c += 3: " + c);
        c -= 2;  
        System.out.println("After c -= 2: " + c);
        c *= 4;  
        System.out.println("After c *= 4: " + c);
        c /= 3;  
        System.out.println("After c /= 3: " + c);
        c %= 5;  
        System.out.println("After c %= 5: " + c);

        //Unary Operators
      
        int d = 10;
        System.out.println("Original d: " + d);
        System.out.println("Post-increment (d++): " + (d++));  
        System.out.println("After post-increment: " + d);
        System.out.println("Pre-increment (++d): " + (++d));   
        System.out.println("Post-decrement (d--): " + (d--));
        System.out.println("After post-decrement: " + d);
        System.out.println("Pre-decrement (--d): " + (--d));
        System.out.println("Unary minus (-d): " + (-d));

        //Ternary Operator
      
        int max = (a > b) ? a : b;
        System.out.println("Maximum value between a and b: " + max);

        //Bitwise and Shift Operators
     
        int p = 5;   // 0101
        int q = 3;   // 0011
        System.out.println("Bitwise AND (p & q): " + (p & q));   // 0001 = 1
        System.out.println("Bitwise OR (p | q): " + (p | q));    // 0111 = 7
        System.out.println("Bitwise XOR (p ^ q): " + (p ^ q));   // 0110 = 6
        System.out.println("Bitwise NOT (~p): " + (~p));         // Inverts bits
        System.out.println("Left Shift (p << 1): " + (p << 1));  // 1010 = 10
        System.out.println("Right Shift (p >> 1): " + (p >> 1)); // 0010 = 2
        System.out.println("Unsigned Right Shift (p >>> 1): " + (p >>> 1));
    }
}

