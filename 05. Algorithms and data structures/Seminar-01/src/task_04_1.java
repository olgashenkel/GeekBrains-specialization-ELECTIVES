/* Задача 4.1 - Числа Фибоначчи (тайминг 10 минут)
    1) Числа Фибоначчи - это последовательность целых чисел.
    Первое и второе число Фибоначчи равны 1. Каждое следующее число вычисляется как сумма
    двух предыдущих значений.
        F(1) = 1;
        F(2) = 1;
        F(n) = F(n-1) + F(n-2)
    2) На вход программе поступает целое число N в отрезке [1; 100].
    3) Напишите рекурсивный алгоритм поиска числа Фибоначчи под номером N.
 */

public class task_04_1 {

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
        System.out.println(fib_rec(10));
        System.out.println(fib_lin(10));
    }
}
