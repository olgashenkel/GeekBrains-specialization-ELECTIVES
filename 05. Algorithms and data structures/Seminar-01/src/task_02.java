/* Задание 2 - Поиск простых чисел (тайминг 10 минут)
    1) Число называется простым, если оно делится без остатка только на 1 и на себя.
    2) На вход поступает целое число N из отрезка [2; 1000].
    3) Написать алгоритм поиска простых чисел в диапазоне от 2 до N.
*/

import java.util.ArrayList;

public class task_02 {

    public static ArrayList<Integer> numbers(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 2; i <= num; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = numbers(100);
        for (Integer i:result){
            System.out.println(i);
        }
    }
}
