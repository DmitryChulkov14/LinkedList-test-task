public class MyLinkedList {

    private Node start;
    private Node end;
    private int size;

    public MyLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        Node temp = new Node(value,null);
        size++ ;
        if(start == null)
        {
            start = temp;
            end = start;
        }
        else
        {
            end.setLink(temp);
            end = temp;
        }
    }

    public void deleteTail() {
        if (start != null) {
            if(start.link == null) {
                start = null;
                end = null;
            } else {
                Node current = start;
                while (current.link.link != null)
                    current = current.link;
                current.link = null;
                end = current;
            }
            size--;
        }
    }

    public void removeElementsGreatThanInputValue(int inputValue) {

        while (start != null && start.value > inputValue) {
            if (start.link != null) {
                start = start.link;
            } else {
                start = null;
                end = null;
            }
            size--;
        }

        if (start != null && start.link != null) {
            Node current = start.link;
            while (current != null && current.link != null) {
                if (current.value > inputValue) {
                    if (current.link != null) {
                        current.setValue(current.link.value);
                        current.setLink(current.link.link);
                    } else {
                        current.setLink(null);
                    }
                    size--;
                } else {
                    current = current.link;
                }
            if (end.value > inputValue) {
                deleteTail();
            }
            }
        }
    }

    class Node {
        private Node link;
        private int value;

        public Node() {
            this.link = null;
            this.value = 0;
        }

        public Node(int value, Node link) {
            this.link = link;
            this.value = value;
        }

        public Node getLink() {
            return link;
        }

        public void setLink(Node link) {
            this.link = link;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
