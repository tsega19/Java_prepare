package Question;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void makeSound();
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
            System.out.println(name+" Sound is Bark");

    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
public  void makeSound(){
            System.out.println("Cat Sound is Meow");

    }

    public static void main(String[] args) {
        Animal dog= new  Dog("Buddy");
        Animal cat = new Cat("Cat");
        dog.makeSound();
        cat.makeSound();
    }
}
