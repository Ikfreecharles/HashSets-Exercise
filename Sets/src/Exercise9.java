import java.util.Arrays;
import java.util.HashSet;

public class Exercise9 {
    public static void main(String[] args) {
        Integer[] number = {1, 2, 3, 2, 4, 3};
        convertArray(number);

        uniqueCharacter("Pineapple");
    }
    public static void convertArray (Integer[] numbers){
        HashSet<Integer> newHash = new HashSet<>(Arrays.asList(numbers));
        System.out.println(newHash);
    }
    public static void uniqueCharacter(String myWord){
        HashSet<Character> wordHash = new HashSet<>();
        String myWordToLowerCase = myWord.toLowerCase();
        for (int i = 0; i < myWordToLowerCase.length(); i++){
            wordHash.add(myWordToLowerCase.charAt(i));
        }
        System.out.println(wordHash);
    }
}
