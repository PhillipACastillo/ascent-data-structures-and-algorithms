package StacksAndQueuesTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    public void setStack() { stack = new Stack(); }

    @Test
    public void stack_HasFirstField() {
        // SETUP
        Node node = new Node();
        node.setValue("first");
        String expected = "first";
        // EXEC
        stack.setFirst(node);
        String actual = (String) stack.getFirst().getValue();
        // ASSERT
        assertEquals(expected, actual, "it should return the string 'first'");
    }

    @Test
    public void stack_HasLastField() {
        // SETUP
        Node node = new Node();
        node.setValue("last");
        String expected = "last";
        // EXEC
        stack.setLast(node);
        String actual = (String) stack.getLast().getValue();
        // ASSERT
        assertEquals(expected, actual, "it should return the string 'last'");
    }

    @Test
    public void stack_HasADefaultSizeOfZero() {
        //SETUP
        int expected = 0;

        // EXECUTION
        int actual = stack.getSize();

        assertEquals(expected, actual, "it should return 0 for an empty queue");
    }

    @Test
    public void stack_returnsTrueIfItsEmpty(){
        //SETUP && Execution
        boolean actual = stack.isEmpty();
        // Assert
        assertTrue(actual,"it should return true for an empty queue");
    }

    @Test
    public void stack_pushTwoItemsToStack() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        int expected = 2;
        // EXEC
        stack.push(first);
        stack.push(second);
        int actual = stack.getSize();
        // ASSERT
        assertEquals(expected, actual, "it should return a size of two");
    }

    @Test
    public void stack_peekReturnsTheLastValueForAStackWithTwoItems() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        // EXEC
        stack.push(first);
        stack.push(second);
        Object actual = stack.peek();
        // ASSERT
        assertEquals(second, actual, "it should return the correct 1st object");
    }

    @Test
    public void stack_popReturnsTheFirstValueForAStackWithTwoItems() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        // EXEC
        stack.push(first);
        stack.push(second);
        Object actual = stack.pop();
        // ASSERT
        assertEquals(second, actual, "it should return the correct last " +
                "object");
    }
}
