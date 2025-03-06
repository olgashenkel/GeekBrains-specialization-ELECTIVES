"""
Сортировка списка

Задача №1
Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.

"""


def sort_list_imperative(numbers):
    n = len(numbers)
    for i in range(n):
        for j in range(i + 1, n):
            if numbers[i] < numbers[j]:
                numbers[i], numbers[j] = numbers[j], numbers[i]
    return numbers


numbers_list = [5, 6, 7, 2, 1, 4, 9, 0]
result = sort_list_imperative(numbers_list)
print(result)

"""
Сортировка списка

Задача № 2
Написать точно такую же процедуру, но в декларативном стиле

"""


def sort_list_declarative(numbers):
    return sorted(numbers, reverse=True)


numbers_list = [1, 5, 7, 4, 6, 2, 1, 0, 4, 7]
result = sort_list_imperative(numbers_list)
print(result)
