import java.util.Scanner;

/**
 * @author PampSPP
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner first = new Scanner(System.in);
        System.out.println("Enter the first name:");

        String firstName = first.nextLine();
        customer.setFirstName(firstName);

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Is there a middle name (y or n):");
        String response = myObj1.nextLine();

        if (response.equals("y")) {
            Scanner middle = new Scanner(System.in);
            System.out.println("Enter the middle name:");
            String middleName = middle.nextLine();
            customer.setMiddleName(middleName);
        }

        Scanner last = new Scanner(System.in);
        System.out.println("Enter the last name:");

        String lastName = last.nextLine();
        customer.setLastName(lastName);

        System.out.println("The customer's name is " + customer.getFullName());

    }
}