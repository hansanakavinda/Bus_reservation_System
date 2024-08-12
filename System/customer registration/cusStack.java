public class cusStack {
    SNode top;

    public cusStack() {
        this.top = null;
    }

    // method to add data to the Stack
    void push(String[] data) {
        // create a new LL node
        SNode temp = new SNode(data);

        // Add the new node on top
        temp.next = top;
        top = temp;
    }

    // Method to remove and key from queue
    String[] pop() {
        String[] out = new String[5];
        // IF Stack is empty, return NULL
        if (isEmpty()) {
            return out;
        }
        // Store previous front and move front one node ahead
        out = top.data;
        top = top.next;
        return out;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            String[] data = new String[5];
            data = top.data;
            System.out.println("Newest customer");
            System.out.println("");
            System.out.println("Customer name: " + data[0]);
            System.out.println("Mobile number: " + data[1]);
            System.out.println("Email ID: " + data[2]);
            System.out.println("City: " + data[3]);
            System.out.println("Age: " + data[4]);
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        SNode current = top;
        if (isEmpty())
            System.out.println("There are no customers");
        while (current != null) {
            String[] data = new String[5];
            data = current.data;
            System.out.println("Customer name: " + data[0]);
            System.out.println("Mobile number: " + data[1]);
            System.out.println("Email ID: " + data[2]);
            System.out.println("City: " + data[3]);
            System.out.println("Age: " + data[4]);
            System.out.println("");
            current = current.next;
        }
    }

}
