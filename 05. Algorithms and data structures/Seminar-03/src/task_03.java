/*
Задание 3 (тайминг 10 минут)
1.Реализуем метод поиска элемента в односвязном списке для проверки наличия
элемента внутри списка.
2.Для корректной работы со связным список необходимо понимать, как именно
можно обходить все значения внутри связного списка.
3.Для нашего примера проще всего будет написать метод поиска значения в
связном списке и возвращения из метода информации о наличии искомого
внутри списка.
 */

//class List {
//    Node head;
//
//    class Node {
//        int value;
//        Node next;
//    }
//    public void pushFront(int value) {
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        head = node;
//    }
//
//    public void popFront() {
//        if(head != null){
//            head = head.next;
//        }
//    }
//
//    public void print(){
//        Node cur = head;
//        while (cur != null){
//            System.out.printf("%d ", cur.value);
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//
//    public boolean consist(int value){
//        Node cur = head;
//        while (cur != null){
//            if(cur.value == value){
//                return true;
//            }
//            cur = cur.next;
//        }
//        return false;
//    }
//
//}



public class task_03 {
    public static void main(String[] args) {
//        List list = new List();
//        for (int i = 1; i <= 5; i++) {
//            list.pushFront(i);
//        }
//        list.print();
//
//        list.popFront();
//        list.popFront();
//
//        list.print();
//
//        System.out.println(list.consist(2));
//        System.out.println(list.consist(4));
    }
}