package xyz.gauravsharma.stack;

import java.util.*;

public class NearestGreaterToRight {

    /*
     * Logic ::
     *
     * start traversing from right..
     * create the stack.
     * if stack.empty -> -1
     * if s.top() > current element => s.top()
     * if s.top() <>> pop the top element...
     * */
    public static int[] findNearestGreaterToRight(int[] input) {
        List<Integer> result = new ArrayList<>();

        Stack<Integer> nearestGreaterToRightStack = new Stack<>();
        for (int i = input.length - 1; i >= 0; i--) {
            if (nearestGreaterToRightStack.empty()) {
                result.add(-1);
            } else if (nearestGreaterToRightStack.peek() > input[i]) {
                result.add(nearestGreaterToRightStack.peek());
            } else {
                nearestGreaterToRightStack.pop();
                while(true) {
                    if (nearestGreaterToRightStack.empty()) {
                        result.add(-1);
                        break;
                    } else if (nearestGreaterToRightStack.peek() > input[i]) {
                        result.add(nearestGreaterToRightStack.peek());
                        break;
                    }
                    nearestGreaterToRightStack.pop();
                }
            }

            nearestGreaterToRightStack.push(input[i]);
        }

        Collections.reverse(result);
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(findNearestGreaterToRight(new int[]{1, 3, 2, 4})).forEach(System.out :: println);
    }

}
