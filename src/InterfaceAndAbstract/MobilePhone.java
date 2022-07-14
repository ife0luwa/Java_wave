package InterfaceAndAbstract;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRing;
    private boolean isOn = false;

// create a constructor
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int number) {
        if(isOn == true) {
            System.out.println("Now ringing " + number + " on mobile phone");
        } else {
            System.out.println("Mobile phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRing == true) {
            System.out.println("Answering the mobile phone");
            isRing = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn == true) {
            isRing = true;
            System.out.println("Melody Ring");
        } else {
            isRing = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
