/*
Motheo Maitin 
11 I
Question 2
2.1
*/
import java.util.*;

import java.io.*;

public class CustomerManager {
    // 2.2
    Customer cArr[] = new Customer[30];
    int size = 0;

    // 2.3
    public CustomerManager() {
        try {
            Scanner scFile = new Scanner(new File("data.txt"));
            String line, name, gender, med;
            int age;
            double cost;
            while (scFile.hasNext()) {
                line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                name = scLine.next();
                age = scLine.nextInt();
                gender = scLine.next();
                cost = Double.parseDouble(scLine.next());
                med = scLine.next();
                cArr[size] = new Customer(name, age, gender, cost, med);
                size++;
                scLine.close();
            }
            scFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found");
        }
    }

    // 2.4
    public String listAllCustomers() {
        String ans = "";
        for (int j = 0; j < size; j++) {
            ans = ans +  cArr[j].toString();
        }
        return ans;
    }

    // 2.5
    public void sortCustomerName() {
        String name1, name2;
        Customer temp;
        for (int j = 0; j < size - 1; j++) {
            name1 = cArr[j].getName();
            for (int i = j + 1; i < size; i++) {
                name2 = cArr[i].getName();
                if (name1.compareToIgnoreCase(name2) > 0) {
                    temp = cArr[j];
                    cArr[j] = cArr[i];
                    cArr[i] = temp;
                }
            }
        }
    }

    // 2.6
    public String findMedicalAid(String request) {
        String allnames = "";
        for (int j = 0; j < size; j++) {
            if (cArr[j].getMedAid().equalsIgnoreCase(request)) {
                allnames = allnames + cArr[j].getName() + "\n";
            }
        }

        return allnames;
    }

    // 2.7
    public String countGender(String g, String m) {
        String gender, medicalaid, ans = "";
        double cost, discounted;
        for (int j = 0; j < size; j++) {
            gender = cArr[j].getGender();
            medicalaid = cArr[j].getMedAid();
            cost = cArr[j].getCostOfPurchase();
            discounted = cost - (cost * 15 / 100);
            if (g.equalsIgnoreCase(gender) && m.equalsIgnoreCase(medicalaid)) {
                ans = ans + "Name is: " + cArr[j].getName() + "\n" + "The cost is: " + discounted + "\n";
            }
        }
        return ans;
    }
}
