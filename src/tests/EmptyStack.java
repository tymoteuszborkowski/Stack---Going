package tests;

import borkowski.Stack;

public class EmptyStack {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        for(int i = 0; i < 10; i++){
            stack.push(new Object());
        }

        for(int i = 0; i < 11; i++){
            try {
                stack.pop();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }
}
