/* Задача - Количество делителей
    1) Дано целое число N из отрезка [1; 1000]. Также даны N целых чисел Ai из отрезка [1; 1000000].
    2) Требуется для каждого числа Ai вывести количество различных делителей этого числа.
    3) В этой задаче несколько верных решений, попробуйте найти наиболее оптимальное.
    4) Для полученного решения укажите сложность в O-нотации.
 */

public class DZ {

/* 1-ый вариант решения
    public static int calc(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                result++;
            }
        }
        return result;
    }
 */

    /* 2-ой вариант решения */
    public static int calc(int a) {
        int result = 0;
        for (int i = 1; i * i <= a; i++) { // O(sqrt(N)) - сложность
            if (a % i == 0) {
                result++;
                if(i*i != a){
                    result++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int N = 1000;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = (int) (Math.random() * 1000000 + 1);
        }
        for (int i = 0; i < N; i++) {   //O(N) - сложность
            System.out.println(numbers[i] + " : " + calc(numbers[i]));
        }
    }
}
