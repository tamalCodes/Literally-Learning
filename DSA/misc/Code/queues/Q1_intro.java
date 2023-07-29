package misc.Code.queues;

public class Q1_intro {

    private int size, rear = -1, arr[];

    Q1_intro(int size) {
        this.size = size;
        arr = new int[size];
    }

    // * enqueue -> This basically means adding an element to the queue */
    // Enqueue adds an element to the rear of the queue

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Full Queue");
            return;
        }

        arr[++rear] = data;

    }

    // * Dequeue -> This basically means removing an element */
    // It will remove the elements from the front of the queue
    // We will run a loop from 0 to rear - 1 and shift the elements to the left by 1
    // We are removing the first element, so the second element now becomes the
    // first element, the third element now becomes the second element and so on

    // after that we decrement the rear by 1

    public void dequeue() {
        if (rear == -1) {
            System.out.println("Empty Queue");
            return;
        }

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;

    }

    // * peek -> This basically means returning the first element */
    // It will return the first element of the queue

    public void peek() {
        if (rear == -1) {
            System.out.println("Empty Queue");
            return;
        }

        System.out.println(arr[0]);
    }

    // * display -> This basically means displaying the elements of the queue */

    public void display() {
        if (rear == -1) {
            System.out.println("Empty Queue");
            return;
        }

        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Q1_intro q = new Q1_intro(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();
    }
}
