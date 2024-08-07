package Sample;

public class Car {
    int id;
    String model;
    int year;

    public Car(int id, String Model, int year){
        this.id = id;
        this.model = Model;
        this.year = year;
    }
    void Display(){
        System.out.println(id+ " ");
        System.out.println(model);
        System.out.println(year);
    }
}
