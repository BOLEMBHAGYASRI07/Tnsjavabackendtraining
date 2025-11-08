package variables;

public class animalmain {
    public static void main(String[] args) {
        animal a1 = new animal(); // object creation

        // ✅ assign values with '='
        a1.name = "Rocky";
        a1.age = 3;
        a1.type = 1;

        // ✅ call method
        a1.eat();

        // ✅ print values properly (quotes around strings)
        System.out.println("Name: " + a1.name);
        System.out.println("Age: " + a1.age);
        System.out.println("Type: " + a1.type);
    }
}