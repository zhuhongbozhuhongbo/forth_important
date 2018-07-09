package javafifo;

class FIFOBag implements Bag {


    private Object[] queue;


    private int first = 0;

    private int last = 0;


    public FIFOBag(int size) {

        queue = new Object[size];

    }


 /* 模拟循环队列 */
    @Override
    public void add(Object thing) {

        if (first == last + 1 || (first == 0 && last == queue.length-1)) {

            throw new RuntimeException("queue overflow!");

        } else {

            // 向队尾添加

            last++;

            if(last == queue.length) {

                last = 0;

            }

            queue[last] = thing;

        }

    }

    @Override
    public Object remove() {

        Object o;

        if (first == last) {

            o = null;

        } else {

            o = queue[first];

            first++;

            if(first == queue.length) {

                first = 0;

            }

        }

        return o;

    }


}