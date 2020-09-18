import java.util.HashSet;

public class Exercise1 {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits);

        for (String myFruits: fruits){
            System.out.println(myFruits);
        }

        fruits.clear();
        System.out.println(fruits.size());
        fruits.add("Grape");
        if(fruits.isEmpty()){
            System.out.println("I am empty");
        }else{
            System.out.println("I am NOT empty");
        }
    }
}
