package xyz.gauravsharma.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToLeft {

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

        Stack<Integer> nearestSmallerToLeftStack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (nearestSmallerToLeftStack.empty()) {
                result.add(-1);
            } else if (nearestSmallerToLeftStack.peek() < input[i]) {
                result.add(nearestSmallerToLeftStack.peek());
            } else {
                nearestSmallerToLeftStack.pop();
                while(true) {
                    if (nearestSmallerToLeftStack.empty()) {
                        result.add(-1);
                        break;
                    } else if (nearestSmallerToLeftStack.peek() < input[i]) {
                        result.add(nearestSmallerToLeftStack.peek());
                        break;
                    }
                    nearestSmallerToLeftStack.pop();
                }
            }

            nearestSmallerToLeftStack.push(input[i]);
        }

        //Collections.reverse(result);
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(findNearestGreaterToRight(new int[]{1, 3, 2, 4})).forEach(System.out :: println);
    }

}
