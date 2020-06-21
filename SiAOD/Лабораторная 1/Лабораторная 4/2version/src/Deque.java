public class Deque {
    private int size;
    private int head;
    private int tail;
    private int[] data;

    Deque(int size) {
        data = new int[this.size = size];
    }

    public void pushBack(int value) {
        data[tail] = value;
    }

    public int popBack() {
        int ret = data[tail];
        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    public void pushFront(int value) {
        data[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    public int popFront() {
        if (++head == size)
            head = 0;
        return data[head];
    }

    public int getHead() {
        return data[head];
    }

    public int getTail() {
        return data[tail];
    }

    public int deleteElementTop() {
        return data[head--];
    }

    public int deleteElementBot() {
        return data[tail++];
    }

    boolean isEmpty() {
        return head == tail;
        //return (head == 0 && tail == size);
    }
}
