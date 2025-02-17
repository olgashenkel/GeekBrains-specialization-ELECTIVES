/* Задача 3 - Игральные кубики (тайминг 15 минут)
    1) Есть K игральных кубиков. У каждого кубика N граней, на которых записаны числа от 1 до N.
    2) На вход программе поступает два целых числа K и N.
    3) Необходимо написать алгоритм поиска всех доступных комбинаций при броске всех этих кубиков.
    4) Вариант 1: количество кубиков может быть строго ограничено (например, 4 кубика).
    5) Вариант 2: количество кубиков будет динамическим (K задает пользователь).
 */


public class task_03 {

    public static int combo_1(int n) {
        // k = 4
        int count = 0;
        // O(n^4)
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    for (int d = 1; d <= n; d++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static int combo_2(int k, int n) {
        if (k > 0)
            return combo_2_rec(1, k, n);

        return 0;
    }

    private static int combo_2_rec(int h, int k, int n) {
        if (h == k + 1)
            return 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += combo_2_rec(h + 1, k, n);
        }
        return count;
    }


    public static void main(String[] args) {

        System.out.println(combo_1(6));
        System.out.println(combo_2(4, 6));
    }
}
