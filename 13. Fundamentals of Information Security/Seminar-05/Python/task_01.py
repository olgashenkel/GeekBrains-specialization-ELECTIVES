'''
Задание №1 «Input validation»

Вам нужно сделать валидацию входных
данных (Input validation) для умножения
данных в заявке-заказе
'''


def error_checking():
    while type:
        x = input('1st factor: ')
        y = input('2st factor: ')

        try:
            x = int(x)
            y = int(y)
            while (x <= 0 or y <= 0 or x > 1000 or y > 1000):
                print('Заказ не может быть меньше/равен 0 или больше 1000. Повторите ввод:')
                x = int(input('1st factor: '))
                y = int(input('2st factor: '))

        except ValueError:
            print('Вы ввели некорректное значение '
                  '(данные должны включать только натуральные числа без пробелов).\nПовторите ввод:')
        else:
            break

    return print('Total = ', x * y)


print(error_checking())
