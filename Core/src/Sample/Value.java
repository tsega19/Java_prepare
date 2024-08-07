package Sample;

public class Value {
    // Fields (attributes)
    String name;
    int age;

    // Constructor
// This constructor initializes a Sample.Value object with a given name and age.
// It takes two parameters: a String for the name and an int for the age.
public Value(String name, int age) {
    this.name = name;
    this.age = age;
}

    // Method to display attributes
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object of the Person class
        Value person = new Value("John", 25);
        person.age=23;
        person.name="Tsega";

        // Call the display method
        person.display();
    }
}
