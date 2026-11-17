// Stack Lab, 11-16. Do the steps in order, one at a time.
//
//   Steps 1-3 are in IntStack.java (pop and size).
//   Steps 4-8 are in this file. They use the stack.
//
// After EVERY step, compile and run:
//
//     javac *.java
//     java StackLab
//
// Each check prints what your code gives (got) and what it should give
// (expected). Do not start the next step until your step says OK.
// The last line says how many checks are OK. 22 of 22 is the goal.

public class StackLab {

    // Step 4: put every item of a on a new stack, and return the stack.
    //     IntStack s = new IntStack();
    //     a for loop over a, with  s.push(a[i]);  inside
    //     return s;
    // Before you run it: pushAll of [1 2 3 4] prints top first. What will
    // the check show? Write your guess in the text box on Blackboard.
    static IntStack pushAll(int[] a) {
        // TODO Step 4
        return new IntStack();
    }

    // Step 5: return a new array with the items of a in reverse order.
    // Use your Step 4: IntStack s = pushAll(a);
    // Then a second loop: result[i] = s.pop();  for i from 0 up.
    // Do not count backwards with an index. The stack reverses for you.
    static int[] reverse(int[] a) {
        int[] result = new int[a.length];
        // TODO Step 5
        return result;
    }

    // Step 6: count the '(' in s by pushing a 1 for each one, then
    // return stack.size(). The loop over a String:
    //     IntStack stack = new IntStack();
    //     for (int i = 0; i < s.length(); i++) {
    //         char c = s.charAt(i);
    //         if (c == '(') {
    //             ...
    //         }
    //     }
    static int countOpen(String s) {
        // TODO Step 6
        return -1;
    }

    // Step 7: are the parentheses balanced? Copy your Step 6 code, then:
    //   - add  else if (c == ')')  that pops one item off the stack
    //   - after the loop, return stack.isEmpty();
    // Each '(' goes on, each ')' takes one off. Balanced means nothing is
    // left at the end.
    //
    // Step 8 (challenge): run it. The check for ")(" stops with
    // "IllegalStateException: stack is empty". A ')' came when nothing was
    // on the stack. Before the pop, check for that and return false.
    static boolean balanced(String s) {
        // TODO Steps 7 and 8
        return false;
    }

    // ---------- checks: do not change below this line ----------

    interface Code {
        Object run();
    }

    static int ok = 0;
    static int total = 0;

    static void check(String what, Code code, Object expected) {
        total = total + 1;
        String got;
        try {
            got = String.valueOf(code.run());
        } catch (Exception e) {
            got = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        boolean same = got.equals(String.valueOf(expected));
        if (same) {
            ok = ok + 1;
        }
        System.out.println(what);
        System.out.println("   got:      " + got);
        System.out.println("   expected: " + expected + (same ? "   OK" : "   <-- not yet"));
    }

    static String show(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s = s + a[i] + " ";
        }
        return "[" + s.trim() + "]";
    }

    public static void main(String[] args) {
        IntStack s = new IntStack();
        System.out.println("== Done in class: push, peek, isEmpty");
        check("new stack isEmpty", () -> s.isEmpty(), true);
        s.push(10);
        s.push(20);
        s.push(30);
        check("push 10, 20, 30, then the stack, top first", () -> s, "30 20 10");
        check("peek", () -> s.peek(), 30);

        System.out.println();
        System.out.println("== Step 1: pop (IntStack.java)");
        check("pop", () -> s.pop(), 30);
        check("the stack after one pop", () -> s, "20 10");
        check("pop again", () -> s.pop(), 20);
        check("pop again", () -> s.pop(), 10);
        check("isEmpty after three pops", () -> s.isEmpty(), true);

        System.out.println();
        System.out.println("== Step 2: pop on the empty stack (IntStack.java)");
        check("pop on the empty stack", () -> s.pop(), "IllegalStateException: stack is empty");

        System.out.println();
        System.out.println("== Step 3: size (IntStack.java)");
        check("size of the empty stack", () -> s.size(), 0);
        s.push(4);
        s.push(8);
        s.push(15);
        check("size after push 4, 8, 15", () -> s.size(), 3);
        check("the stack is still there after size", () -> s, "15 8 4");

        System.out.println();
        System.out.println("== Step 4: pushAll");
        check("pushAll [1 2 3 4], then the stack, top first", () -> pushAll(new int[] {1, 2, 3, 4}), "4 3 2 1");
        check("pushAll [] is empty", () -> pushAll(new int[] {}).isEmpty(), true);

        System.out.println();
        System.out.println("== Step 5: reverse");
        check("reverse [1 2 3 4]", () -> show(reverse(new int[] {1, 2, 3, 4})), "[4 3 2 1]");
        check("reverse [7]", () -> show(reverse(new int[] {7})), "[7]");

        System.out.println();
        System.out.println("== Step 6: countOpen");
        check("countOpen \"(()\"", () -> countOpen("(()"), 2);
        check("countOpen \"a(b)(c\"", () -> countOpen("a(b)(c"), 2);

        System.out.println();
        System.out.println("== Step 7: balanced");
        check("balanced \"(())\"", () -> balanced("(())"), true);
        check("balanced \"(()\"", () -> balanced("(()"), false);
        check("balanced \"(a + b) * (c - d)\"", () -> balanced("(a + b) * (c - d)"), true);

        System.out.println();
        System.out.println("== Step 8 (challenge): a ')' with nothing to match");
        check("balanced \")(\"", () -> balanced(")("), false);

        System.out.println();
        System.out.println(ok + " of " + total + " checks OK");
    }
}
