package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 1;

        while(input == 1)
        {
            System.out.println("1. Commercial");
            System.out.println("2. Residential");
            System.out.println("3. Done");
            int choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    commercial();
                    input = 2;
                    break;
                case 2:
                    residential();
                    input = 2;
                    break;
                case 3:
                    System.out.println("Session ended.");
                    input = 2;
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 3.");
            }
        }
    } // end main

    // commercial customer
    private static void commercial()
    {
        boolean mult = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Commercial Customer");
        System.out.println("Customer Name: ");
        String name = scanner.nextLine();
        System.out.println("Customer Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Customer Address: ");
        String address = scanner.nextLine();
        System.out.println("Square footage of property: ");
        String foot = scanner.nextLine();
        Double footage = Double.parseDouble(foot);
        System.out.println("Name of property: ");
        String prop = scanner.nextLine();
        System.out.println("Multiple properties? True or False");
        String discout = scanner.nextLine();
        if (discout.substring(0,1).equals('t') || discout.substring(0,1).equals('T'))
        {
            mult = true;
        }

        Commercial customer = new Commercial(name, phone, address, footage, prop,  mult);
        customer.display();
    }

    private static void residential()
    {
        boolean mult = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Residential Customer");
        System.out.println("Customer Name: ");
        String name = scanner.nextLine();
        System.out.println("Customer Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Customer Address: ");
        String address = scanner.nextLine();
        System.out.println("Square footage of property: ");
        String foot = scanner.nextLine();
        Double footage = Double.parseDouble(foot);
        System.out.println("Name of property: ");
        String prop = scanner.nextLine();
        System.out.println("Senior Discount? True or False");
        String discout = scanner.nextLine();
        if (discout.substring(0,1).equals('t') || discout.substring(0,1).equals('T'))
        {
            mult = true;
        }

        Residential res = new Residential(name, phone, address, footage, mult);
    }

}
