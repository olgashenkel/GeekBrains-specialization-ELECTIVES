'''
Геометрические фигуры: круг

● Контекст
Теперь, когда у вас есть абстрактный класс Shape, ваша следующая задача - получить класс Circle.

● Задача
Реализовать дочерний от Shape класс Circle, включая следующие работающие методы:
○ конструктор класса __init__ - метод инициализации класса Circle.
○ get_area - метод для расчета площади круга
○ get_perimeter - метод для расчета периметра окружности
'''
import task_01
import math


class Circle(task_01.Shape):
    def __init__(self, radius):
        self.radius = radius

    def get_area(self):
        return math.pi * (self.radius ** 2)

    def get_perimetr(self):
        return 2 * math.pi * self.radius
