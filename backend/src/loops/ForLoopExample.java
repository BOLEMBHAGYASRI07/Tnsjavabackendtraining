package loops;

public class ForLoopExample {
    public static void main(String[] args) {

        // 1️⃣ Simple for loop
        System.out.println("Simple For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2️⃣ For loop with even numbers
        System.out.println("\nEven Numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        // 3️⃣ For loop in reverse order
        System.out.println("\nCountdown from 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // 4️⃣ Nested for loop (Multiplication table)
        System.out.println("\nMultiplication Table (1 to 3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // 5️⃣ For-each loop (Enhanced for loop)
        System.out.println("\nFor-each Loop (Array Example):");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}