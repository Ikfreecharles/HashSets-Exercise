import java.util.Comparator;
import java.util.TreeSet;

public class Exercise7 {
    public static void main(String[] args) {
        TreeSet<Integer> values = new TreeSet<>(Comparator.reverseOrder());
        values.add(20);
        values.add(24);
        values.add(16);
        values.add(12);
        values.add(18);

        System.out.println(values);
    }
}