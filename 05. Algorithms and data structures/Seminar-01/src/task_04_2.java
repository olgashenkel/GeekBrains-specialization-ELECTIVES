/* Задача 4.1 - Числа Фибоначчи (тайминг 10 минут)
    1) Сравните время работы алгоритмов из задач 4.1 и 4.2;
    2) Для сравнения в языке Java есть класс Date с методом getTime().
*/

import java.util.Date;

public class task_04_2 {

    public static void test(){
        for (int num=10; num<=45; num++){
            Date start = new Date();
            fib_rec(num);
            Date end = new Date();
            long timeDate1 = end.getTime() - start.getTime();

            start = new Date();
            fib_lin(num);
            end = new Date();
            long timeDate2 = end.getTime() - start.getTime();

            System.out.printf("num: %d, rec: %d, lin: %d\n", num, timeDate1, timeDate2);
        }
    }
    public static int fib_rec(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 1;
        }
        return fib_rec(num - 1) + fib_rec(num - 2);
    }


    public static int fib_lin(int num) {
        final int[] numbers = new int[num + 1];
        numbers[1] = 1;
        numbers[2] = 1;
        for (int i = 3; i <= num; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[num];
    }


    public static void main(String[] args) {
//        System.out.println(fib_rec(10));
//        System.out.println(fib_lin(10));
        test();
    }
}
