public class MyLinkedList {

    private Node start;
    private int size;

    public MyLinkedList() {
        start = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        Node current = start;

        if(current == null) {
            start = new Node(value, null);
        } else {
            while (current.link != null) {
                current = current.link;
            }
            current.link = new Node(value, null);
        }
        size++ ;
    }

    public void deleteTail() {
        if (start != null) {
            if(start.link == null) {
                start = null;
            } else {
                Node current = start;
                while (current.link.link != null)
                    current = current.link;
                current.link = null;
            }
            size--;
        }
    }

    public void removeElementsGreatThanInputValue(int inputValue) {
        if (start != null && start.link != null) {
            Node current = start;
            while (current != null && current.link != null) {
                if (current.value > inputValue) {
                    if (current.link != null) {
                        current.setValue(current.link.value);
                        current.setLink(current.link.link);
                    }
                    size--;
                } else {
                    current = current.link;
                }
            }
            if (current != null && current.link == null) {
                if (current.value > inputValue) {
                    deleteTail();
                    size--;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = start;
        while (current != null) {
            if (current.link != null) {
                sb.append(current.value).append(", ");
            } else {
                sb.append(current.value);
            }
            current = current.link;
        }
        sb.append("]");
        return sb.toString();
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
