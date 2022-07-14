package com.learningwithBuchalka;

public class Main {
    public static void main(String[] args) {
//    Cars porsche = new Cars();
//    porsche.setModel("maybach");
//        System.out.println(porsche.getModel());

        //BankAccount gtBank = new BankAccount("1234","23de","2334");
//        gtBank.setAccountNumber("0158369126");
//        gtBank.deposit();
//        gtBank.withdrawal(100);
//        gtBank.getBalance();
//        gtBank.setCustomerName("Babalola Ifeoluwa");
//        System.out.println(gtBank.getCustomerName());
//        gtBank.setEmail("clementolu07@gmail.com");
//        System.out.println(gtBank.getEmail());
//        gtBank.setPhoneNumber("+234 814-124-783-2");
//        gtBank.getPhoneNumber();

        VipCustomer cust = new VipCustomer(2430, "ask@com");
        System.out.println(cust.getCreditLimit(2400));

    }
}
