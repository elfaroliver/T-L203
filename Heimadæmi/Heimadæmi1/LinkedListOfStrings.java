/******************************************************************************
 *  Compilation:  javac LinkedListOfStrings.java
 *  Execution:    java LinkedListOfStrings
 *  Dependencies: StdIn.java StdOut.java
 *
 *  A linked list of strings.
 *
 *  % java LinkedListOfStrings 1 2 3 4 5
 *  Number of items: 5
 *  5->4->3->2->1->
 *
 ******************************************************************************/
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.*;

public class LinkedListOfStrings {
    private int N;          // size of list
    private Node first;     // first node of list

    // helper Node class
    private static class Node {
        private String item;
        private Node next;
    }

    public LinkedListOfStrings() {
        N = 0;
        first = null;
    }

    // is the list empty?
    public boolean isEmpty() { 
        return first == null; 
    }

    // number of elements on the stack
    public int size() { 
        return N; 
    }


    // add an element to the front of the list
    public void addFront(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    // delete and return the first item in the list
    public String delFront() {
        if (isEmpty()) throw new NoSuchElementException("No items in list");
        String item = first.item;      // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }

    public void addBack(String item) {
        if (isEmpty()) {
            first = new Node();
            first.item = item;
        } else {
            Node current = first;
            while (current.next != null) { // Fer í last node
            current = current.next;
            }
            current.next = new Node(); // Ný node í endann
            current.next.item = item; // Assigna item í ný node
        }
        N++;
    }

    // print out the list
    public void printList() {
        Node x = first;
        for (int i=0; i<N; i++) {
            StdOut.print(x.item + "->");
            x = x.next;
        }
        StdOut.println();
    }        

    // test client
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings();
        for (int i=0; i < args.length; i++) {
            list.addBack(args[i]);
        }
        
        System.out.println("Number of items: " + list.size());
        
        list.printList();
        
    }

}