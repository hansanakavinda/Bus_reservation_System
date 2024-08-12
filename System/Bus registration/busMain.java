import java.util.Scanner;

public class busMain {
    static Scanner get = new Scanner(System.in);
    static busStack s = new busStack();
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        System.out.println("* * * Select an option from the menu * * *");
        System.out.println("");
        System.out.println("1 Register Bus");
        System.out.println("2 Search bus");
        System.out.println("3 Remove registered bus");
        System.out.println("4 View all registered busess");
        System.out.println("0 Exit");
        boolean validInput = false;
        int input = 0;
        while (!validInput){
            try {
                System.out.print(">>> ");
                input  = get.nextInt();
                if (0 <= input && input <=4 ){ // validates the user input
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

    static void operations(int item){
        if (item == 1){ // add elements to stack
            String[] data = new String[6];
            String input = get.nextLine();
            while (input == null || input.isEmpty()) { // avoid adding empty inputs
                System.out.println("Enter Bus number:");
                input = get.nextLine();
            }
            data[0] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Total seats:");
                input = get.nextLine();
            }
            data[1] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Starting point:");
                input = get.nextLine();
            }
            data[2] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter End point:");
                input = get.nextLine();
            }
            data[3] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Starting time:");
                input = get.nextLine();
            }
            data[4] = input;
            input = null;
            while (input == null || input.isEmpty()) {
                System.out.println("Enter Fare:");
                input = get.nextLine();
            }
            data[5] = input;

            s.push(data);
            System.out.println("------------------------------------------------");
            menu();
        } else if (item == 2) { // view top element
            System.out.println("Newly registered bus");
            s.peek();
            System.out.println("-------------------------------------------------");

            menu();
        } else if (item == 3) {  // remove top element
            s.pop();
            System.out.println("--------------------------------------------------");

            menu();
        }  else if (item == 4) { // view all elements
            System.out.println("All registered Bussess");
            s.printStack();
            System.out.println("---------------------------------------------------");

            menu();
        }  else if (item == 0) {
            
        }
    }

}
