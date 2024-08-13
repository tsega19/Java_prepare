package OOB;
public class Classes {
    private String name;
    private static int count;
//    public Classes(){
//        this.name = name;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public static void main(String[] args) {
        Classes p = new Classes();
        p.name = "test";
        System.out.println(p.getName());
    }
}
