package InterfaceAndAbstract;

public class Main {
    public static void main(String[] args) {
        ITelephone landPhone;

        landPhone = new DeskPhone(8141247);
        landPhone.powerON();
        landPhone.dial(12344);
        landPhone.callPhone(12345);
        System.out.println();

        landPhone = new MobilePhone(12345);
        landPhone.powerON();
        landPhone.dial(14567);
        landPhone.callPhone(23456);




    }
}
