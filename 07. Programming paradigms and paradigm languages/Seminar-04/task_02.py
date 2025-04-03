'''
Задача 2. Фильтрация данных

● Контекст
Предположим, что есть какой-то массив содержащий данные о разных людях и их возрасте и вас
попросили ответить на следующий вопрос: “сколько в массиве людей возраста > 30?”. Для этого, вы
хотите написать программу для фильтрации наблюдений по возрастному признаку.
● Ваша задача
Написать скрипт принимающий на вход массив с данными о людях и число - возраст, а возвращающий
число - количество людей старше указанного возраста.

'''

people = [
    {'name': 'Elizaveta', 'age': 25},
    {'name': 'Vasiliy', 'age': 30},
    {'name': 'Sergey', 'age': 35},
    {'name': 'Ivan', 'age': 40}
]

def filter_by_age(people:list, min_age:int) -> list:
    return list(filter(lambda pers: min_age <= pers['age'], people))

age = 30
filtered_people = filter_by_age(people, age)
print(filtered_people)
print(len(filtered_people))