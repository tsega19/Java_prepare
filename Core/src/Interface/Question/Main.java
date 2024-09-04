package Interface.Question;

import java.util.*;
class TestJavaCollection1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Rav");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add("Rav");   System.out.println(list.indexOf("Rav"));
//Traversing list through Iterator  
        for (String s : list) {
//            System.out.println(s);

        }
    }
}  