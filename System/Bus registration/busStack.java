public class busStack {
    SNode top;

    public busStack() {
        this.top = null;
    }

    // method to add data to the Stack
    void push(String[] data) {
        // create a new LL node
        SNode temp = new SNode(data);

        // Add the new node on top
        temp.next = top;
        top = temp;
        System.out.println("Bus registered successfully");
    }

    // Method to remove top
    String[] pop() {
        String[] out = new String[6];
        // IF Stack is empty, return NULL
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return out;
        }

        // Store node next to top as top
        out = top.data;
        top = top.next;
        System.out.println("Bus No " + out[0] + " Successfully removed");
        return out;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            String[] data = new String[6];
            data = top.data;
            System.out.println("Bus No: " + data[0]);
            System.out.println("Total Seats: " + data[1]);
            System.out.println("Starting point: " + data[2]);
            System.out.println("End point: " + data[3]);
            System.out.println("Starting time: " + data[4]);
            System.out.println("Fare: " + data[5]);
            System.out.println("");
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        SNode current = top;
        while (current != null) {
            String[] data = new String[6];
            data = current.data;
            System.out.println("Bus No: " + data[0]);
            System.out.println("Total Seats: " + data[1]);
            System.out.println("Starting point: " + data[2]);
            System.out.println("End point: " + data[3]);
            System.out.println("Starting time: " + data[4]);
            System.out.println("Fare: " + data[5]);
            System.out.println("");
            current = current.next;
        }
    }
}
