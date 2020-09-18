import java.util.TreeSet;

public class Exercise3 {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println(fruits);
        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
