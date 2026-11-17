// IntStack: a stack of ints. Last in, first out.
//
// The front of the list is the top of the stack. top is the "first"
// from the November 9 lab, with a new name:
//
//     top
//      |    
//      v
//     [ 30 | next ]---->[ 20 | next ]---->[ 10 | null ]
//
// push, peek, isEmpty, and toString are done. You write pop (Steps 1 and 2)
// and size (Step 3). After every step, run:
//
//     javac *.java
//     java StackLab

public class IntStack {
    private Node top;   // null means the stack is empty

    // Done in class: the new item goes on top (the head insert from 11-09).
    public void push(int item) {
        top = new Node(item, top);
    }

    // Done in class: true when there is nothing on the stack.
    public boolean isEmpty() {
        return top == null;
    }

    // Done in class: return the top item, but leave it on the stack.
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return top.item;
    }

    // Step 1: take the top item off and return it. Three lines:
    //     1. save top.item in an int variable
    //     2. move top to the next node:  top = top.next;
    //     3. return the saved item
    // Why save first? After line 2, the old top item is gone.
    //
    // Step 2: what if the stack is empty? Then top is null and top.item
    // crashes. Before line 1, add the same if that peek has.
    public int pop() {
       if(isEmpty()) {
         throw new IllegalStateException("Stack is empty");
       }
        int item = top.item;
        top = top.item;
        return item;
    }

    // Step 3: return how many items are on the stack.
    // Here is the November 9 loop that PRINTS every item:
    //
    //     Node current = top;
    //     while (current != null) {
    //         System.out.println(current.item);
    //         current = current.next;
    //     }
    //
    // Copy it, add  int count = 0;  before it, change the println line to
    // count = count + 1;  and return count after the loop.
    // Walk with current, never with top: moving top changes the stack.
    public int size() {
        int count = 0;
        Node current = top;

        while(current != null) {
          count = count + 1;
          current = current.next;
        }
        return count;
    }

    // Done for you: the items from top to bottom, like "30 20 10".
    public String toString() {
        String s = "";
        Node current = top;
        while (current != null) {
            s = s + current.item + " ";
            current = current.next;
        }
        return s.trim();
    }
}
