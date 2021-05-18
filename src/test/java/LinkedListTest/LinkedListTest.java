package LinkedListTest;

import LinkedList.LinkedList;
import LinkedList.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void linkedlist_CanCreateANewLinkedList() {
        // SETUP
        LinkedList linkedlist = new LinkedList();
        //ASSERT
        assertTrue(linkedlist instanceof LinkedList);
    }
    // head, tail, and size
    @Test
    public void node_HasHeadField(){
        //SETUP
        LinkedList linkedlist = new LinkedList();
        // EXCECUTION
        Node node = new Node();
        linkedlist.setHead(node);
        //ASSERT
        assertTrue(linkedlist.getHead() instanceof Node);
    }

    @Test
    public void node_HasTailField(){
        //SETUP
        LinkedList linkedlist = new LinkedList();
        // EXCECUTION
        Node node = new Node();
        linkedlist.setTail(node);
        //ASSERT
        assertTrue(linkedlist.getTail() instanceof Node);
    }

    @Test
    public void node_HasADefaultSizeOfZero() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        int expected = 0;

        // EXECUTION
        int actual = linkedList.getSize();

        assertEquals(expected, actual, "It should return zero for an empty LL");
    }

    @Test
    public void linkedList_returnsTrueIfItsEmpty(){
        //SETUP
        LinkedList linkedlist = new LinkedList();

        //Execution
        boolean isEmpty = linkedlist.isEmpty();
        // Assert
        assertTrue(isEmpty);
    }

    @Test
    public void linkedList_addsANewObjectToAnEmptyLinkedList() {
        // SETUP
        LinkedList linkedList = new LinkedList();

        // EXECUTION
        linkedList.add(new Object());

        // ASSERT
        assertTrue(linkedList.getTail() instanceof Node
            && linkedList.getHead() instanceof Node
            && linkedList.getSize() == 1);
    }

    @Test
    public void linkedList_addsANewObjectToALinkedListWithTwoItems() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(new Object());
        // EXECUTE
        String hello = "Hello";
        linkedList.add(hello);
        // ASSERT
        assertTrue(linkedList.getTail().getValue() instanceof String
                && linkedList.getHead().getValue() != hello
                && linkedList.getSize() == 3);
    }

    @Test
    public void linkedList_getFirstItemInList(){
        // SETUP
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(new Object());
        linkedList.add("hello");

        //EXEC
        Object three = linkedList.getFirst();
        //ASSERT
        assertEquals(3, three);
    }
    
    @Test
    public void linkedList_getFirstItemInListWhenItsEmpty(){
        // SETUP
        LinkedList linkedList = new LinkedList();
        //EXEC
        Object empty = linkedList.getFirst();
        //ASSERT
        assertEquals(null, empty);
    }

    @Test
    public void linkedList_getLastItemInList(){
        // SETUP
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(new Object());
        linkedList.add("hello");

        //EXEC
        Object hello = linkedList.getLast();
        //ASSERT
        assertEquals("hello", hello);
    }

    @Test
    public void linkedList_getLastItemInListWhenItsEmpty(){
        // SETUP
        LinkedList linkedList = new LinkedList();
        //EXEC
        Object empty = linkedList.getLast();
        //ASSERT
        assertEquals(null, empty);
    }

    @Test
    public void linkedList_getNthItem(){
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        Object node2 = linkedList.get(1);
        //ASSERT
        assertEquals(expectedObject, node2);
    }

    @Test
    public  void linkedList_getNthItemIndexOutOfBoundsException() throws Exception{
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        //ASSERT
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(3);
        });
    }

    @Test
    public void linkedList_containsTheStringHelloAtIndex2() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        int actual = linkedList.contains("hello");
        //ASSERT
        assertEquals(2, actual, "It should return 2 for string 'hello'");
        ;
    }

    @Test
    public void linkedList_deletesObjectAtIndex1() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        linkedList.delete(expectedObject);
        //ASSERT
        assertEquals(2, linkedList.getSize(), "It should return 2 for the size");
        assertEquals(linkedList.get(1), "hello");
    }

    @Test
    public void linkedList_deletesObjectAtHead() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        linkedList.delete(3);
        //ASSERT
        assertEquals(2, linkedList.getSize(), "It should return 2 for the " +
                "size");
        assertEquals(expectedObject, linkedList.get(0));
    }

    @Test
    public void linkedList_deletesObjectAtTail() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        linkedList.delete("hello");
        //ASSERT
        assertEquals(2, linkedList.getSize(), "It should return 2 for the " +
                "size");
        assertEquals(expectedObject, linkedList.getTail().getValue());
    }


    @Test
    public void linkedList_deletesByIndexAt1() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        linkedList.deleteByIndex(1);
        //ASSERT
        assertEquals(2, linkedList.getSize(), "It should return 2 for the size");
        assertEquals(linkedList.get(1), "hello");
    }


    @Test
    public void linkedList_deletesByIndexAtHead() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        linkedList.deleteByIndex(0);
        //ASSERT
        assertEquals(2, linkedList.getSize(), "It should return 2 for the " +
                "size");
        assertEquals(expectedObject, linkedList.get(0));
    }

    @Test
    public void linkedList_deletesByIndexAtTail() {
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC
        linkedList.deleteByIndex(2);
        //ASSERT
        assertEquals(2, linkedList.getSize(), "It should return 2 for the " +
                "size");
        assertEquals(expectedObject, linkedList.getTail().getValue());
    }

    @Test
    public void linkedList_deletesByIndexOutOfBounds() throws Exception{
        // SETUP
        LinkedList linkedList = new LinkedList();
        Object expectedObject = new Object();
        linkedList.add(3);
        linkedList.add(expectedObject);
        linkedList.add("hello");
        //EXEC;
        //ASSERT
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.deleteByIndex(3);
        });
    }

}
