""" Задание № 3.

Доля чисел: императивный вариант

Условие:
На вход подается: список целых чисел arr

Задача:
    Реализовать императивную функцию, которая возвращает три числа:
            ○ Долю положительных чисел
            ○ Долю нулей
            ○ Долю отрицательных чисел

"""


def numbers_share(array):
    pos_cnt, neg_cnt, zero_cnt = 0, 0, 0
    for el in array:
        if el > 0:
            pos_cnt += 1
        elif el < 0:
            neg_cnt += 1
        else:
            zero_cnt += 1
    pos_shr, neg_shr, zero_shr = pos_cnt / len(array), neg_cnt / len(array), zero_cnt
    return pos_shr, neg_shr, zero_shr


print(numbers_share([0, 0, 0, 2, 5, 8, -7, -15]))

"""
Задание № 3.

Доля чисел: декларативный вариант

Условие:
На вход подается: список целых чисел arr

Задача:
    Реализовать декларативную функцию, которая возвращает три числа:
            ○ Долю положительных чисел
            ○ Долю нулей
            ○ Долю отрицательных чисел
"""


def numbers_share_declarative(array):
    pos_cnt = len(list(filter(lambda x: x > 0, array)))
    neg_cnt = len(list(filter(lambda x: x < 0, array)))
    zero_cnt = len(list(filter(lambda x: x == 0, array)))
    counts = [pos_cnt, neg_cnt, zero_cnt]
    shares = list(map(lambda x: x / len(array), counts))
    return shares


print(numbers_share([0, 0, 0, 2, 5, 8, -7, -15, 0, 0, 0, 0]))
