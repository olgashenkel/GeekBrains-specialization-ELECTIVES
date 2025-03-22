/*
Задача № 5. Реализовать свой класс Хэш-таблицы.
 */

public class HashMap {

    // Класс сущности, хранящий два поля
    class Entity {
        int key;    // поле - ключ
        int value;  // поле - значение
    }

    // Класс списка
    class Basket {
        Node head;

        class Node {
            Entity entity;
            Node next;
        }

        // Логический метод push
        private boolean push(Entity entity) {
            Node node = new Node();
            node.entity = entity;
            if (head == null) {
                head = node;
            } else {
                Node cur = head;
                while (cur.next != null) {
                    if (cur.entity.key == entity.key) {
                        return false;
                    }
                    cur = cur.next;
                }
                cur.next = node;
            }
            return true;
        }


        // Поиск элемента (внутренний поиск). Логическое значение (нашли/не нашли нужный элемент)
        private Integer find(int key) {
            Node cur = head;
            while (cur != null) {
                if (cur.entity.key == key) {
                    return cur.entity.value;
                }
                cur = cur.next;
            }
            return null;
        }


        // Удаление объекта из списка
        private boolean remove(int key) {

            if (head != null) {
                if (head.entity.key == key) {
                    head = head.next;
                } else {
                    if (head.next != null) {
                        Node cur = head;
                        while (cur != null) {
                            if (cur.entity.key == key) {
                                cur.next = cur.next.next;
                                return true;
                            }
                            cur = cur.next;
                        }
                    }
                }
            }
            return false;
        }

    }

    // Переменные класса HashMap
    static final int INIT_SIZE = 16; // переменная - первоначальный размер HashMap
    Basket[] baskets;   // массив, в котором будут храниться элементы Хэш-таблицы


    // Для инициализации создадим два конструктора:
    // 1-Конструктор (конструктор по умолчанию), который будет выдавать конструктор с параметром INIT_SIZE
    public HashMap() {
        this(INIT_SIZE);
    }

    // 2-Конструктор с перегрузкой и параметром size, в котором будет задаваться размер массива Basket[]
    public HashMap(int size) {
        baskets = new Basket[size];
    }


// МЕТОДЫ РАБОТЫ С ХЭШ-ТАБЛИЦЕЙ:
    // Операция добавления элемента:

    // Метод, который будет возвращать индекс
    private int getIndex(int key) {
        return key % baskets.length;
    }

    // Метод вставки в саму таблицу Basket, который вернет значение true, если вставка прошла успешно
    // или false, если произошла ошибка
    // Не происходить вставка будет в том случае, если параметр KEY уже существует,
    // т.к. в Хэш-таблицах элементы хранятся только уникальные, как и в бинарном дереве поиска!
    public boolean push(int key, int value) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket == null) {
            basket = new Basket();
            baskets[index] = basket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;
        return basket.push(entity);
    }

    // Удаление объекта по ключу
    public boolean remove(int key) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket != null) {
            return basket.remove(key);
        }
        return false;
    }

    // Поиск элемента (внешний поиск). Логическое значение (нашли/не нашли нужный элемент)
    public Integer find(int key) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket != null) {
            return basket.find(key);
        }
        return null;
    }

}
