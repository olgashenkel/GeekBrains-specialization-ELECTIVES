'''
Задача. Корреляция

● Контекст
Корреляция - статистическая мера, используемая для оценки
связи между двумя случайными величинами.
● Ваша задача
Написать скрипт для расчета корреляции Пирсона между
двумя случайными величинами (двумя массивами). Можете
использовать любую парадигму, но рекомендую использовать
функциональную, т.к. в этом примере она значительно
упростит вам жизнь
'''

from functools import reduce
import math


def correlation(data1, data2):
    n = len(data1)
    mean1 = sum(data1) / n
    mean2 = sum(data2) / n

    deviation1 = list(map(lambda x: x - mean1, data1))
    deviation2 = list(map(lambda x: x - mean2, data2))

    numerator = reduce(lambda x, y: x + y[0] * y[1], zip(deviation1, deviation2), 0)
    denominator = \
        math.sqrt(reduce(lambda x, y: x + y ** 2, deviation1, 0)) \
        * math.sqrt(reduce(lambda x, y: x + y ** 2, deviation2, 0))
    if denominator == 0:
        return 0
    return numerator / denominator


data1 = [1, 2, 3, 4, 5]
data2 = [2, 3, 5, 6, 8]
corr = correlation(data1, data2)

print(corr)
