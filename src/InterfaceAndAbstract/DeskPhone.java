package InterfaceAndAbstract;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRing;

//create a constructor
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        System.out.println("Invalid command, desk phone does not have a power button");
    }

    @Override
    public void dial(int number) {
        System.out.println("Now ringing " + number + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRing == true) {
            System.out.println("Answering the desk phone");
            isRing = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRing = true;
            System.out.println("Ring Ring");
        } else {
            isRing = false;
            System.out.println("Not ringing");
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
