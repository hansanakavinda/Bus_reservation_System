import java.util.Scanner;

public class cusMain {
    static cusStack s = new cusStack();
    static Scanner get = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() { // main menu of the customer registration process
        System.out.println("---- Select an option from the menu ----");
        System.out.println("");
        System.out.println("1 Register cutomers");
        System.out.println("2 View newly registered customer");
        System.out.println("3 Remove customers");
        System.out.println("4 View all registered cutomers");
        System.out.println("0 Exit");
        boolean validInput = false;
        int input = 0;
        while (!validInput) { // validate the user input
            try {
                System.out.print(">>> ");
                input = get.nextInt(); // only accepts integer as input
                if (0 <= input && input <= 4)  validInput = true; 
                else System.out.println("Invalid input");
            } catch (Exception e) {
                System.out.println("Invalid input");
                get.next(); // remove the invalid input from the buffer
            }
        }
        System.out.println("");
        operations(input);
    }

    static void operations(int item) {
        if (item == 1) { // add data to stack
            String[] data = new String[5];
            String input = get.nextLine();
            while (input == null || input.isEmpty()) { // avoid adding empty values
                System.out.println("Enter your name:");
                input = get.nextLine();
            }
            data[0] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter your Mobile number:");
                input = get.nextLine();
                try { // checks mobile number validity
                    Integer.parseInt(input);
                    if (input.length() != 10) { // checks the mobile number length
                        System.out.println("mobile number invalid");
                        input = null;
                    }
                } catch (Exception e) {
                    System.out.println("invalid input");
                    input = null;
                }
            }
            data[1] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter your Email ID:");
                input = get.nextLine();
            }
            data[2] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter your City:");
                input = get.nextLine();
            }
            data[3] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter your Age:");
                input = get.nextLine();
            }
            data[4] = input;

            s.push(data);
            System.out.println("Customer registered successfully");
            System.out.println("");
            menu();
        } else if (item == 2) { // get top element from the stack
            s.peek();
            System.out.println("----------------------------------------------");
            menu();
        } else if (item == 3) { // remove top element from the stack
            String data [] = s.pop();
            System.out.println( "Customer " + data[0] + "removed successfully");
            System.out.println("----------------------------------------------");
            menu();
        } else if (item == 4) { // view all element in the stack
            cusStack snew = new cusStack();
            String data[] = s.pop();
            while (data[0] != null){
                snew.push(data);
                data = s.pop();
            }
            System.out.println("All registered customers");
            System.out.println("");
            snew.printStack();
            System.out.println("-----------------------------------------------");
            menu();
        } else if (item == 0) {

        }
    }
}
