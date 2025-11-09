package Encapsulation;

// Demo for encapsulation
public class Person {
    private int pid;
    private String name;
    private int age;

    // Getters and Setters are used to access private data outside the class

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
