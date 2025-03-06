""" Задание № 1.

Поиск: императивный

Контекст:
Предположим, что нам хочется для любого массива чисел array и любого числа target
узнать содержится ли target в array. Такую процедуру будем называть поиском.

Задача:
Реализовать императивную функцию поиска элементов на языке Python
"""


def search_imperative(array, target):
    for el in array:
        if el == target:
            return True
    return False


print(search_imperative([1, 2, 3, 4, 5, 6], 2))

"""Задание № 1.

Поиск: декларативный

Контекст:
Предположим, что нам хочется для любого массива чисел array и любого числа target
узнать содержится ли target в array. Такую процедуру будем называть поиском.

Задача:
Реализовать декларативную функцию поиска элементов на языке Python
"""


def search_imperative(array, target):
    if target in array:
        return True
    else:
        return False

print(search_imperative([1, 2, 3, 4, 5, 6], 8))
