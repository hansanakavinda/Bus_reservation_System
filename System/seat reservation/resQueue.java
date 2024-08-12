public class resQueue {
    QNode front, rear;

    public resQueue() {
        this.front = this.rear = null;
    }

    // method to add an key to the queue
    void enqueue(String[] key) {
        // create a new LL node
        QNode temp = new QNode(key);

        // if queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;

    }

    // Method to remove and key from queue
    String[] dequeue() {
        String[] out = new String[5];
        // IF queue is empty, return NULL
        if (IsEmpty()) {
            System.out.println("There are no reservations made");
            return out;

        }

        // Store previous front and move front one node ahead
        out = this.front.key;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
        System.out.println("Reservation cancelled");
        return out;
    }

    void printQueue() {
        QNode current = front;
        System.out.println("");
        if (IsEmpty()) {
            System.out.println("There are no reservations");
        } else {
            while (current != null) {
                String[] data = new String[4];
                data = current.key;
                System.out.println("Customer name : " + data[0]);
                System.out.println("Bus number : " + data[1]);
                System.out.println("Seat number : " + data[2]);
                System.out.println("Booked date : " + data[3]);
                System.out.println("");
                current = current.next;
            }
        }
    }

    void peek() {
        if (IsEmpty()) {
            System.out.println("There are no reservations");

        } else {
            String[] data = new String[4];
            data = front.key;
            System.out.println("Customer name : " + data[0]);
            System.out.println("Bus number : " + data[1]);
            System.out.println("Seat number : " + data[2]);
            System.out.println("Booked date : " + data[3]);
        }

    }

    boolean IsEmpty() {
        return this.front == null;
    }
}
