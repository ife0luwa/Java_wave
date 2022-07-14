package Encapsulation_challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
        this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
    }

    public int fillUp (int litres) {
        if (litres > 0 && litres <= 100) {
            if (litres + this.tonerLevel > 100) {
                return -1;
            }
            this.tonerLevel += litres;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    // note: account for duplex printer that prints 2 pages at once
    public int print (int numberOfPages) {
        int pagesToPrint = numberOfPages;
        if (isDuplex == true) {
            pagesToPrint = (numberOfPages / 2) + (numberOfPages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
