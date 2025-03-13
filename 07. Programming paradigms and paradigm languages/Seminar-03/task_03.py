'''
Геометрические фигуры: треугольник

● Контекст
И наконец, последняя задача - по аналогии с кругом создать класс для треугольника и расчета его
характеристик.

● Задача
Реализовать дочерний от Shape класс Triangle, включая следующие работающие методы:
○ конструктор класса __init__ - метод инициализации класса.
○ get_area - метод для расчета площади
○ get_perimeter - метод для расчета периметра
'''

import task_01
import math


class Triangle(task_01.Shape):
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_area(self):
        p = self.get_perimetr() / 2
        return math.sqrt(p * (p - self.a) * (p - self.b) * (p - self.c))

    def get_perimetr(self):
        return self.a + self.b + self.c
