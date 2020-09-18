import javafx.beans.binding.ObjectExpression;

import java.util.HashSet;

public class Exercise4 {
    public static void main(String[] args) {
        HashSet<Object> set1 = new HashSet<>();
        set1.add(2);
        set1.add(5);
        set1.add(7);

        HashSet<Object> set2 = new HashSet<>();
        set2.add(2);
        set2.add(5);
        set2.add(8);

        System.out.println("The intersection:");
        intersection(set1, set2);
        System.out.println("The union:");
        union(set1, set2);
        System.out.println("The difference:");
        difference(set1, set2);
    }
    public static void intersection(HashSet<Object> set1, HashSet<Object> set2){
        HashSet<Object> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
    public static void union(HashSet<Object> set1, HashSet<Object> set2){
        HashSet<Object> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
    }
    public static void difference (HashSet<Object> set1, HashSet<Object> set2){
        HashSet<Object> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
