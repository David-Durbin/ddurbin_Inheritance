package com.company;

public class Residential extends Customer{
    public boolean senior = false; // check for senior citizen discount
    private double cost = 6.0; // cost per square foot for residential customers

    // default constructor
    public Residential(String customerName, String customerPhone, String customerAddress, double squareFootage, boolean senior) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.senior = senior;
    }

    // calculate and display functions
    private double calculate()
    {
        double total = 0;
        double sqf = super.getSquareFootage();

        total = (cost * ((sqf / 1000) + (sqf % 1000)));

        if(this.senior == true)
        {
            total = total * .85;
        }

        return total;
    }

    public void display()
    {
        System.out.println("Customer: " + super.getCustomerName());
        System.out.println("Address:  " + super.getCustomerAddress());
        System.out.println("Senior Discount: " + this.senior);
        System.out.println("Cost: $" + calculate() + " per week.");
    }

    // accessor and mutator functions

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }
}
