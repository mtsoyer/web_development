/*
Motheo Maitin 
11 I
Question 3
3.1
*/

import javax.swing.*;
public class CustomerUI {
    public static void main(String[] args) {

        // 3.2
        CustomerManager cm = new CustomerManager();
        // 3.3
        System.out.println("All the customers: ");
        System.out.println(cm.listAllCustomers());

        // 3.4
        System.out.println("All the customers sorted by name: ");
        cm.sortCustomerName();
        System.out.print(cm.listAllCustomers());

        // 3.5
        String findmedical = JOptionPane.showInputDialog("Please search for a medical aid.");
        System.out.println("Customers belonging to " + findmedical + ": ");
        if (cm.findMedicalAid(findmedical).equals("")) {
            System.out.println("Not found.");

        } else {
            System.out.println("\n" + cm.findMedicalAid(findmedical));

        }

        // 3.6
        String gender = JOptionPane.showInputDialog("Please input the gender.");
        String medical = JOptionPane.showInputDialog("Please input the medical aid.");
        System.out.println("All the costs of customers of " +gender + " gender in " + medical + ": ");
        if (cm.countGender(gender, medical).equals("")) {
            System.out.println("Not found.");
        } else {
            System.out.print("\n" + cm.countGender(gender, medical));
        }

    }

}
