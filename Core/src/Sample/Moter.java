package Sample;

public class Moter extends Car {
    String type;
    public Moter(String types, int id, String model, int year){
       super(id, model, year);
        this.type= types;
    }
    void Moter(){
        super.Display();
        System.out.println(type);
    }
    public static void main(String[] args){
        Moter myObject = new Moter("Electric", 12345, "Tesla Model S", 2022);
        myObject.Moter();
    }

}
