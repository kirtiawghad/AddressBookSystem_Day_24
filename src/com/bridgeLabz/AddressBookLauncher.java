package com.bridgeLabz;

import java.util.Scanner;

public class AddressBookLauncher {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1.create a new contact");
            System.out.println("2.fill contact details");
            System.out.println("3.display all contacts");
            System.out.println("4.exit");
            System.out.print("enter option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook.createNewContact();
                    break;
                case 2:
                    addressBook.fillContactDetails();
                    break;
                case 3:
                    addressBook.display();
                    break;
                case 4:
                    System.out.println("exiting....");
                    System.exit(0);
                default:
                    System.out.println("please enter the correct choice");
                    break;
            }

        }

    }}