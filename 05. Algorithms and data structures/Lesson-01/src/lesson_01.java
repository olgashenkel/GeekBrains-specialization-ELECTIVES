import java.util.ArrayList;
import java.util.List;

public class lesson_01 {

    public static void main(String[] args) {
        List<Integer> availableDivider = findSimpleNumbers(100);
//        for (Integer integer : availableDivider) {
//            System.out.println(integer);
//        }
    }

    public static List<Integer> findAvailableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0){
                    simple = false;
                    break;
                }
            }
            if (simple){
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }
}