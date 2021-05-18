package StacksAndQueues;

public class Stack {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    public boolean isEmpty() {
        if (size == 0 && first == null && last == null) {
            return true;
        }
        return false;
    }

    public void push(Object object) {
        Node node = new Node();
        node.setValue(object);

        if (this.first == null) {
            this.setFirst(node);
            this.last = this.first;
        } else {
            Node originalFirst = this.first;
            this.setFirst(node);
            this.first.setNext(originalFirst);
        }
        size += 1;
    }

    public Object peek() {
        if (size == 0 && this.first == null && this.last == null) {
            return null;
        }
        return this.getFirst().getValue();
    }

    public Object pop() {
        if (size == 0 && this.first == null && this.last == null) {
            return null;
        }

        Object popped = this.getFirst().getValue();
        if (this.first == this.last) {
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.getNext();
        }
        size -= 1;
        return popped;
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

    public int getSize() {
        return size;
    }

}
