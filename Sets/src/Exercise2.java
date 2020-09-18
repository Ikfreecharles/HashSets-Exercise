import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {
        for(Integer eachNumber: randomSet(50)){
            System.out.println(eachNumber + " * 2 = " + eachNumber * 2);
        }
    }
    public static HashSet<Integer> randomSet (int amount){
        HashSet<Integer> myNumbers = new HashSet<>();
//        System.out.println(range);
//        System.out.println(55.1f);
//        System.out.println((int)55.1);
//        for (int i = 0; i <= 50; i++){
//            int range = (int)(Math.random()*100);
//            myNumbers.add(range);
//        }
        while(myNumbers.size() != amount){
            int range = (int)(Math.random()*100);
            myNumbers.add(range);
        }
//        System.out.println(myNumbers.size());
        return myNumbers;
    }
}
