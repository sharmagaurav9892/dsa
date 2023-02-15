package xyz.gauravsharma.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NearestGreaterToLeft {

    /*
     * Logic ::
     *
     * start traversing from left..
     * create the stack.
     * if stack.empty -> -1
     * if s.top() > current element => s.top()
     * if s.top() <>> pop the top element...
     * */
    public static int[] findNearestGreaterToRight(int[] input) {
        List<Integer> result = new ArrayList<>();

        Stack<Integer> nearestGreaterToLeftStack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (nearestGreaterToLeftStack.empty()) {
                result.add(-1);
            } else if (nearestGreaterToLeftStack.peek() > input[i]) {
                result.add(nearestGreaterToLeftStack.peek());
            } else {
                nearestGreaterToLeftStack.pop();
                while(true) {
                    if (nearestGreaterToLeftStack.empty()) {
                        result.add(-1);
                        break;
                    } else if (nearestGreaterToLeftStack.peek() > input[i]) {
                        result.add(nearestGreaterToLeftStack.peek());
                        break;
                    }
                    nearestGreaterToLeftStack.pop();
                }
            }

            nearestGreaterToLeftStack.push(input[i]);
        }

        //Collections.reverse(result);
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(findNearestGreaterToRight(new int[]{1, 3, 2, 4})).forEach(System.out :: println);
    }

}
