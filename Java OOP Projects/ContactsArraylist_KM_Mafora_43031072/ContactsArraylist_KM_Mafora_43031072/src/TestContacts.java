//KM Mafora
//43031072
//Practical 6
import java.util.*;
public class TestContacts {
    public static void addContacts(Contact lstContact[]){


        Scanner scan = new Scanner(System.in);
        int i = 0;
        //first iteration
        System.out.print("Enter the name of a Contact (N to quit): ");
        String response = scan.nextLine();




        while(!(response.equals("N"))) {

            Contact tempObjects = new Contact();
            tempObjects.setName(response); // First and only setting of name

            System.out.print("Enter the cell phone number: ");
            String number = scan.nextLine();
            tempObjects.setNumbers(number);

            lstContact[i] = tempObjects;

            i++;

            System.out.print("Enter the name of another Contact (N to quit): ");
            response = scan.nextLine();



        }

    }

    public static void displayContacts(Contact lstContact[]){
        int i = 0;
        System.out.println("Name of the Contacts\t\tCell Phone Number");
        for(Contact x:lstContact){


            if (x!= null) {

                String name= x.getName();
                String number=x.getNumber();
//                System.out.println("Name of the Contacts\t\tCell Phone Number");
                System.out.println((i + 1) + ". " + x.toString(name, number));
                i++;
            }

        }}
    //-----------------------------------------------------------------------------
    public static void removeContacts(Contact[] lstContacts) {
        Scanner scans = new Scanner(System.in);

        System.out.print("Enter number of contact to remove (-1 to quit): ");
        int remove = scans.nextInt();

        if (remove != -1 && remove >= 0 && remove < lstContacts.length) {
            for (int i = remove; i < lstContacts.length - 1; i++) {
                lstContacts[i] = lstContacts[i + 1];
            }
            lstContacts[lstContacts.length - 1] = null; // Set the last element to null after shifting
        } else {
            System.out.println("Invalid input or no contact at that index.");
        }
        displayContacts(lstContacts);
    }

    //------------------------------------------------------------
    public static void findAContact(Contact lstContacts[]) {
        Scanner scans = new Scanner(System.in);
        System.out.print("Enter the name to lookup: ");
        String find = scans.nextLine();
        int checker = 0;

        for (int x = 0; x < lstContacts.length; x++) {
            Contact y = lstContacts[x];
            if (y != null) {
                if (y.getName().equalsIgnoreCase(find)) {
                    String name = y.getName();
                    String number = y.getNumber();
                    System.out.println(name + " is on the list\n The cell number is: " + number);

                    System.out.print("do you want to change the cell number(Y or N):");
                    String change_Answer=scans.nextLine();

                    if (change_Answer.equalsIgnoreCase("Y")){
                        System.out.print("entrer the new cell number");
                        String newnumber=scans.nextLine();

                        y.setNumbers(newnumber);
                    }
                    checker++;
                    break;
                }
            }
        }

        if (checker == 0) {
            System.out.println(find + " Is not on the list ");
            System.out.print("Do you want to add the contact (Y or N)?: ");
            String answer = scans.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Enter the new cell number: ");
                String new_numb = scans.nextLine();

                Contact tempObjects = new Contact();
                tempObjects.setName(find);
                tempObjects.setNumbers(new_numb);

                System.out.println("Current list of the Contacts");
                displayContacts(lstContacts);

                System.out.print("Enter the position where " + find + " must be added on the list: ");
                int pos = scans.nextInt();

                // Shift existing contacts to the right to make room for the new contact
                for (int i = lstContacts.length - 1; i >= pos; i--) {
                    lstContacts[i] = lstContacts[i - 1];
                }

                // Insert the new contact at the specified position
                lstContacts[pos - 1] = tempObjects;
                displayContacts(lstContacts);
            }
        }
    }

    //-----------------------------------------------------------------------------
    public static void main(String arg[]){
        final int num=15;
        Contact[] lstContacts = new Contact[num];

        addContacts(lstContacts);
        displayContacts(lstContacts);
        findAContact(lstContacts);
        removeContacts(lstContacts);
    }
}
