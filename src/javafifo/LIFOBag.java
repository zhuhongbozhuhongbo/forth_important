package javafifo;

public class LIFOBag implements Bag {

    private Object[] stack;


    private int stackTop = 0;


    public LIFOBag(int size) {

        stack = new Object[size];

    }


    @Override
    public void add(Object thing) {

        if (stackTop == stack.length - 1) {

            throw new RuntimeException("stack overflow!");

        } else {

            stackTop++;

            stack[stackTop] = thing;

        }

    }


    @Override
    public Object remove() {

        Object o;

        if (stackTop == 0) {

            o = null;

        } else {

            o = stack[stackTop];

            stackTop--;

        }

        return o;

    }


    public static void main(String[] args) {

        Bag bag = new LIFOBag(50);

        for(int i = 0; i< 50; i++) {

            bag.add(i);

            Object o = bag.remove();

            System.out.println(o);

        }

    }
}
