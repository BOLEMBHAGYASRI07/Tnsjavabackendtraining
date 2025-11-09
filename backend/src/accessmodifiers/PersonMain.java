package accessmodifiers;
import Encapsulation.Person;
// Executor class for Person
public class PersonMain {

    public static void main(String[] args) {

        Person p = new Person();

        // Setting data using setters
        p.setName("Lavanya");
        p.setPid(786875);
        p.setAge(36);

        // Getting data using getters
        System.out.println("Name: " + p.getName());
        System.out.println("PID: " + p.getPid());
        System.out.println("Age: " + p.getAge());
    }
}
