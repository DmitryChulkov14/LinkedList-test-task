public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(6);
        myLinkedList.add(2);
        myLinkedList.add(8);
        myLinkedList.add(1);
        myLinkedList.add(10);
        myLinkedList.add(1);
        System.out.println(myLinkedList.toString());
        myLinkedList.deleteTail();
        System.out.println(myLinkedList.toString());
        myLinkedList.removeElementsGreatThanInputValue(3);
        System.out.println(myLinkedList.toString());
    }
}
