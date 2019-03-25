package com.company;

public class Commercial extends Customer{
    public String propertyName = "";
    public boolean multiProperty = false;
    private double cost = 5.0; // cost per square foot for commercial per week

    // default constructor
    public Commercial(String customerName, String customerPhone, String customerAddress, double squareFootage, String propertyName, boolean multiProperty) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.propertyName = propertyName;
        this.multiProperty = multiProperty;
    }

    // calculate charages
    private double calculate()
    {
        double total = 0;
        double sqf = super.getSquareFootage();

        total = (cost * ((sqf / 1000) + (sqf % 1000)));

        if(this.multiProperty == true)
        {
            total = total * .9;
        }

        return total;
    }

    // display function  you don't mix your calculate and display functions, that is just a way to break things
    public void display()
    {
        System.out.println("Customer: " + super.getCustomerName());
        System.out.println("Property: " + this.propertyName);
        System.out.println("Address:  " + super.getCustomerAddress());
        System.out.println("Multi-Property: " + this.multiProperty);
        System.out.println("Cost: $" + calculate() + " per week.");
    }

    // accessor and mutator functions
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public boolean isMultiProperty() {
        return multiProperty;
    }

    public void setMultiProperty(boolean multiProperty) {
        this.multiProperty = multiProperty;
    }
}
