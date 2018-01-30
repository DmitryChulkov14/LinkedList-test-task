public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(0);
        myLinkedList.add(5);
        myLinkedList.add(8);
        myLinkedList.add(2);
        myLinkedList.deleteTail();
        myLinkedList.add(10);
        myLinkedList.add(7);
        myLinkedList.removeElementsGreatThanInputValue(3);
        System.out.println(myLinkedList);
    }
}
