package StacksAndQueues;

public class Queue {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    public boolean isEmpty() {
        if (size == 0 && first == null && last == null) {
            return true;
        }
        return false;
    }

    public void add(Object object) {
            Node node = new Node();
            node.setValue(object);

            if (this.first == null) {
            this.setFirst(node);
            this.last = this.first;
        } else {
            this.last.setNext(node);
            this.setLast(node);
        }
        size += 1;
    }

    public Object peek() {
        if (size == 0 && this.first == null && this.last == null) {
            return null;
        }
        return this.getFirst().getValue();
    }

    public Object remove() {
        if (size == 0 && this.first == null && this.last == null) {
            return null;
        }

        Object removed = this.getFirst().getValue();
        if (this.first == this.last) {
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.getNext();
        }
        size -= 1;
        return removed;
    }

    public int getSize() {
        return size;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
