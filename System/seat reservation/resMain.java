import java.util.Scanner;

public class resMain {
    static Scanner get = new Scanner(System.in);
    static resQueue q = new resQueue();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("* * * Select an option from the menu * * *");
        System.out.println("");
        System.out.println("1 Make reservation");
        System.out.println("2 Cancel reservation");
        System.out.println("3 View all reservations");
        System.out.println("0 Exit");
        boolean validInput = false;
        int input = 0;
        while (!validInput) { 
            try {
                System.out.print(">>> ");
                input = get.nextInt();
                if (0 <= input && input <= 3) { // validates the user input
                    validInput = true;
                } else
                    System.out.println("Invalid input");
            } catch (Exception e) {
                System.out.println("Invalid input");
                get.next(); // remove the invalid input from the buffer
            }
        }
        System.out.println("");
        operations(input);
    }

    static void operations(int item) {
        if (item == 1) { // add elements to stack
            String[] data = new String[4];
            String input = get.nextLine();
            while (input == null || input.isEmpty()) { // avoid adding empty inputs
                System.out.println("Enter Customer name:");
                input = get.nextLine();
            }
            data[0] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Bus number:");
                input = get.nextLine();
            }
            data[1] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Seat number:");
                input = get.nextLine();
            }
            data[2] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Date:");
                input = get.nextLine();
            }
            data[3] = input;
            q.enqueue(data);
            System.out.println("Seat number " + data[2] + " successfuly reserved");
            System.out.println("------------------------------------------------");
            menu();
        } else if (item == 2) { // remove front element
            System.out.println("Do you want to cancel the reservation? ");
            String empty = get.nextLine(); // scanner to get the input from pressing enter after the main method 
            String userInput = get.nextLine();
            userInput.toLowerCase();
            if (userInput.equals("yes")) {
                String data[] = q.dequeue();
                System.out.println("");
                System.out.println("Seat number " + data[2] + " is available to reserve");
            }
            System.out.println("-------------------------------------------------");
            menu();
        } else if (item == 3) { // View all the reservations
            q.printQueue();
            System.out.println("--------------------------------------------------");

            menu();
        } else if (item == 0) {

        }
    }

}
