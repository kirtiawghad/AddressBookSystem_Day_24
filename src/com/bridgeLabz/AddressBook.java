package com.bridgeLabz;
import java.io.File;
import java.util.Scanner;

public class AddressBook {
    // class variable
    static final Scanner scanner = new Scanner(System.in);

    // instance method
    void createNewContact() throws Exception {
        System.out.print("Enter name of the contact:");
        String contactName = scanner.nextLine();
        File file = new File(contactName);
        if (file.exists())
        {
            System.out.println("contact " + file.getName() + " already exists!");
        }
        else
        {
            if (file.createNewFile())
            {
                System.out.println("new contact " + file.getName() + " is created successfully");
            }
            else
            {
                System.out.println("file creation failed!");
            }
        }

    }
}
