package Question;

public class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void DisplayPerson() {
        System.out.println("Name: " + name + " Age: " + age + " Address: " + address);
    }

    public static void main(String[] args) {
        Person p = new Person("John Doe", 30, "123 Main St");
        System.out.println(p.getAddress());
        p.setAddress("Addis Ababa");
        p.DisplayPerson();

    }
}
