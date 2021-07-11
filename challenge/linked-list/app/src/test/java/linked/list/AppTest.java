/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import LinkedList.linkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    /**
     * Code Challenge: Class 05: Linked List Implementation
     */

    @Test public void CreateAnLinkedList() {
        linkedList<Object> link = new linkedList<>();
        assertEquals("Linked list is empty", link.toString());
    }
    @Test public void insert() {
        linkedList<Object> link = new linkedList<>();
        link.append(10);
        assertEquals("{10}-> NULL", link.toString());
    }
    @Test public void MultipleInsert() {
        linkedList<Object> link = new linkedList<>();
        link.append(10);
        link.append(10);
        link.append(10);
        assertEquals("{10}-> {10}-> {10}-> NULL", link.toString());
    }
    @Test public void testLinkedListIncludesTrue() {
        linkedList<Object> link = new linkedList<>();
        link.append(10);
        link.append(11);
        link.append(12);
        assertEquals(true, link.includes(11));
    }

    @Test public void testLinkedListIncludesFalse() {
        linkedList<Object> link = new linkedList<>();
        link.append(10);
        link.append(11);
        link.append(12);
        assertEquals(false, link.includes(20));
    }
    @Test public void collectionOfAllValue() {
        linkedList<Object> link = new linkedList<>();
        link.append(10);
        link.append(11);
        link.append(12);
        assertEquals("{10}-> {11}-> {12}-> NULL", link.toString());
    }


    /**
     * Code Challenge: Class 06:
     */

    @Test public void insertToTheEndOfList() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);

        assertEquals("{10}-> NULL", link.toString());
    }
    @Test public void insertMultipleToTheList() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        assertEquals("{10}-> {11}-> {12}-> NULL", link.toString());
    }
    @Test public void insertBeforeTheMiddleOfList() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        link.insertBefore(11,20);
        assertEquals("{10}-> {20}-> {11}-> {12}-> {13}-> NULL", link.toString());
    }
    @Test public void insertBeforeTheFirstOfList() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        link.insertBefore(10,20);
        assertEquals("{20}-> {10}-> {11}-> {12}-> {13}-> NULL", link.toString());
    }
    @Test public void insertAfterTheMiddleOfList() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        link.insertAfter(11,20);
        assertEquals("{10}-> {11}-> {20}-> {12}-> {13}-> NULL", link.toString());
    }
    @Test public void insertAfterTheLastNodeList() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        link.insertAfter(13,20);
        assertEquals("{10}-> {11}-> {12}-> {13}-> {20}-> NULL", link.toString());
    }

    /**
     * Code Challenge: Class 07
     */

    @Test public void k_AreGraterThanTheLength() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        assertEquals("Out of Bonds", link.kthFromEnd(10));
    }
    @Test public void k_AreEqualToTheLength() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        assertEquals(10, link.kthFromEnd(3));
    }
    @Test public void k_AreNotPositiveInteger() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        assertEquals("Out of Bonds", link.kthFromEnd(-20));
    }
    @Test public void LinkedListOfSizeOne() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        assertEquals(10, link.kthFromEnd(0));
    }
    @Test public void k_IsInTheMiddle() {
        linkedList<Object> link = new linkedList<>();
        link.insertAtEnd(10);
        link.insertAtEnd(11);
        link.insertAtEnd(12);
        link.insertAtEnd(13);
        link.insertAtEnd(14);
        link.insertAtEnd(15);
        assertEquals(12, link.kthFromEnd(3));
    }
}