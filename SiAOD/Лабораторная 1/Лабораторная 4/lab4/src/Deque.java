public class Deque {
    private int dequeSize;
    private int[] dequeArray;
    private int top;
    private int bot;

    public Deque(int n) {
        this.dequeSize = n;
        this.dequeArray = new int[dequeSize];
        this.top = -1;
        this.bot = dequeSize;
    }

    public void addElementTop(int element) {
        dequeArray[++top] = element;
    }

    public void addElementBot(int element) { dequeArray[--bot] = element; }

    public int deleteElementTop() {
        return dequeArray[top--];
    }

    public int deleteElementBot() {
        return dequeArray[bot++];
    }

    public int getTop() {
        return dequeArray[top];
    }

    public int getBot() {
        return dequeArray[bot];
    }

    public boolean isEmpty() {
        return (top == - 1 && bot == dequeSize);
    }

    public boolean isFull() {
        return (top == bot);
    }
}
