package InterfaceAndAbstract;

public interface ITelephone {
    void powerON();
    void dial(int number);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
