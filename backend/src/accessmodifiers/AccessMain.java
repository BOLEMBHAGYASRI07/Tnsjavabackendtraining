package accessmodifiers
// Executor class for accessdemo
public class AccessMain {

    public static void main(String[] args) {
        AccessDemo ob = new AccessDemo();

        // Able to access public, protected, default
        ob.name = "AVN";
        // ob.contactno = 896876876; // ❌ Not visible (private)
        ob.address = "HYD";
        ob.branch = "AIML";

        ob.display();
    }
}
