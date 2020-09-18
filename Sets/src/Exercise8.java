import java.util.HashSet;

public class Exercise8 {
    public static void main(String[] args) {
        HashSet<Object> set1 = new HashSet<>();
        set1.add("Banana");
        set1.add(5);
        set1.add(7);
        set1.add(10);

        HashSet<Object> set2 = new HashSet<>();
        set2.add(2);
        set2.add("Banana");
        set2.add("Chocolate");
        set2.add(9);

        symmetricDifference(set1, set2);
    }
    public static void symmetricDifference(HashSet<Object> set1, HashSet<Object> set2){
        HashSet<Object> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.removeAll(set2);
        set2.removeAll(set1);
        symmetricDiff.addAll(set2);

        System.out.println(symmetricDiff);
    }
}
