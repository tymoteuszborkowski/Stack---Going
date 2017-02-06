package tests;

import borkowski.Stack;

public class FullStack {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        for(int i = 0; i < 11; i++){
            Object o = new Object();
            try {
                stack.push(o);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

    }
}
