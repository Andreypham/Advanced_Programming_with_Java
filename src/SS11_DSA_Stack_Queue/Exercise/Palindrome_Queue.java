package SS11_DSA_Stack_Queue.Exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome_Queue {
    public static void main(String[] args) {
        String str = "able was I ere I saw elba";
        String[] chars = str.split("");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            queue.add(chars[i]);
            stack.add(chars[i]);
        }

        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (!(queue.remove()).equals(stack.pop())) {
                flag = false;
                System.out.println(str + ": is not a Palindrome string");
                break;
            }
        }

        if (flag) {
            System.out.println(str + ": is a Palindrome string");
        }
    }
}
