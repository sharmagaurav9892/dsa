package xyz.gauravsharma.stack;

import java.util.*;

public class NearestSmallerToRight {

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

        Stack<Integer> nearestSmallerToRightStack = new Stack<>();
        for (int i = input.length - 1; i >= 0; i--) {
            if (nearestSmallerToRightStack.empty()) {
                result.add(-1);
            } else if (nearestSmallerToRightStack.peek() < input[i]) {
                result.add(nearestSmallerToRightStack.peek());
            } else {
                nearestSmallerToRightStack.pop();
                while(true) {
                    if (nearestSmallerToRightStack.empty()) {
                        result.add(-1);
                        break;
                    } else if (nearestSmallerToRightStack.peek() < input[i]) {
                        result.add(nearestSmallerToRightStack.peek());
                        break;
                    }
                    nearestSmallerToRightStack.pop();
                }
            }

            nearestSmallerToRightStack.push(input[i]);
        }

        Collections.reverse(result);
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(findNearestGreaterToRight(new int[]{1, 3, 2, 4})).forEach(System.out :: println);
    }

}
