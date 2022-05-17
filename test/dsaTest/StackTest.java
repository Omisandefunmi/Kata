package dsaTest;

import dsa.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void testThatStackExist(){
        assertNotNull(stack);
    }

    @Test
    public void stackIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushElement_StackNotEmpty(){
        stack.push("first guy  in");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushElement_popElement_StackIsEmpty(){
        stack.push("first guy in");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushElement_peekElement(){
        stack.push("first");
        String peek = stack.peek();
        assertEquals("first", peek);
    }

    @Test
    public void pushTwoElements_peekLastElement(){
        stack.push("first");
        stack.push("second");
        assertEquals("second", stack.peek());
    }

    @Test
    public void stackCanPeekByIndex(){
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        assertEquals("third",stack.peek(3));
    }

    @Test
    public void stackSizeCorrespondsWithElementsContainedTest(){
        stack.push("first");
        stack.push("second");
        assertEquals(2, stack.size());
    }

    @Test
    public void pushElements_PopEOnlyFirstElement(){
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        stack.pop();
        assertNull(stack.peek(1));
    }


    @Test
    public void otherElementsInStackAdjustAfterPop(){
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        stack.pop();
        assertEquals("second",stack.peek(1));


    }

}
