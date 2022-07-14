package com.learningwithBuchalka;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private float balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;


    // create deposit and withdraw methods
    public void deposit () {
        System.out.print("Input deposit amount: ");
        float amnt = input.nextFloat();
        this.balance += amnt;
        System.out.println("Deposit of " + amnt + " was made. New balance:" + this.balance);
    }

    public void withdrawal (float amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient balance. Only " + this.balance + " available");
        } else {
            this.balance -= amount;
            System.out.println(amount + " was withdrawn. " +
                    "Remaining balance:" + this.balance);
        }
    }

    //create getters for each field
    //create a scanner to take user input

    //account number
    Scanner input = new Scanner(System.in);
    public void setAccountNumber (String acc) {
        this.accountNumber = acc;
        System.out.println("your account number: " + this.accountNumber);
    }

    public String getAccountNumber () {
        return this.accountNumber;
    }


    //balance
    public void getBalance () {
        System.out.println("Account balance: " + this.balance);
    }

    //customer name
    public void setCustomerName (String name) {
        this.customerName = name;
    }
    public String getCustomerName () {
        return this.customerName;
    }

    //email
    public void setEmail (String mailAddress) {
        this.email = mailAddress;
    }
    public String getEmail () {
        return this.email;
    }

    // phone number
    public void setPhoneNumber (String number) {
        this.phoneNumber = number;
    }
    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    // creating constructors
    // create a constructor taking parameters
    public BankAccount (String number, float bal,String name,
                        String emailAddress, String phone) {
        this.accountNumber = number;
        this.balance = bal;
        this.customerName = name;
        this.email = emailAddress;
        this.phoneNumber = phone;
    }

    // crete a constructor that calls another constructor
    public BankAccount () {
        this("0158369126", 230, "ifeoluwa clement",
                "babscrystals@yahoo.com","08141347654");
        System.out.println("empty constructor called");
    }

    // create a constructor without complete parameters

    public BankAccount(String accountNumber, String email, String phoneNumber) {
        this(accountNumber,230,"ifeoluwa babs",email,phoneNumber );
        System.out.println("incomplete constructor called");
    }
}
