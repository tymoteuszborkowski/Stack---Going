package borkowski;

public class Stack {

    private final Object[] T;
    private int top = 0;


    public Stack(int maxSize){
        T = new Object[maxSize];
    }


    public void push(Object obj) throws IndexOutOfBoundsException {
        if (top < T.length){
            T[top] = obj;
            top++;
        }else {
            throw new IndexOutOfBoundsException("Stack is full.");
        }
    }

    public Object pop() throws IndexOutOfBoundsException{
        if (top <= 0) {
            throw new IndexOutOfBoundsException("Stack is empty.");
        }

        Object output = T[top-1];
        top--;

        return output;
    }


}
