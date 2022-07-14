package com.learningwithBuchalka;

public class VipCustomer {
    private String customerName;
    private int creditLimit;
    private String emailAddress;

    //create constructors
    public VipCustomer () {
        this("ifeoluwa", 2500, "babscrystals@yahoo.com");
    }

    public VipCustomer (int creditLimit, String emailAddress) {
        this("ifeoluwa",creditLimit, emailAddress);
    }
    public VipCustomer (String name, int limit, String email ) {
        this.customerName = name;
        this.creditLimit = limit;
        this.emailAddress = email;
    }

    public String getCustomerName(String name) {
        return customerName;
    }

    public int getCreditLimit(int limit) {
        return creditLimit;
    }

    public String getEmailAddress(String email) {
        return emailAddress;
    }
}
