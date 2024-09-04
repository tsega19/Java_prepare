package Interface.Question;

public interface Swimmable{
    void swim();
    default void swimTest(){
        System.out.println("Test Default");
    }
}