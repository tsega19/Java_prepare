public class Main {
    int id;
    String name;

  // This method sets the registration details by assigning the provided UUID to the id variable
// and the provided names to the name variable.
void set_registration(int UUID, String names){
    id= UUID;
    name= names;
}

   void get_registration(){
       System.out.println(id + " " + name);
   }
    public static void main(String[] args) {
        Main r1 = new Main();
        Main r2 = new Main();
        r1.set_registration(12, "User1");
        r2.set_registration(13, "Users2");
        r1.get_registration();
        r2.get_registration();
    }
}
