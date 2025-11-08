package operators;

public class TypesOfOperators {
    public static void main(String[] args) {

        // 1️⃣ Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2️⃣ Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3️⃣ Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // 4️⃣ Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5 : " + c);
        c -= 2;
        System.out.println("c -= 2 : " + c);
        c *= 3;
        System.out.println("c *= 3 : " + c);
        c /= 4;
        System.out.println("c /= 4 : " + c);
        c %= 2;
        System.out.println("c %= 2 : " + c);

        // 5️⃣ Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d++ : " + (d++));  // post-increment
        System.out.println("++d : " + (++d));  // pre-increment
        System.out.println("d-- : " + (d--));  // post-decrement
        System.out.println("--d : " + (--d));  // pre-decrement

        // 6️⃣ Ternary Operator
        System.out.println("\nTernary Operator:");
        int result = (a > b) ? a : b;
        System.out.println("Max value is: " + result);
    }
}