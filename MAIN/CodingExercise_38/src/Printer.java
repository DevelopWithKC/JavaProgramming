public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if ((tonerLevel < 0) || (tonerLevel > 100))
            this.tonerLevel = -1;
        else
            this.tonerLevel = tonerLevel;

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerAmount > 0 && tonerAmount <= 100)
        {
            if(tonerLevel + tonerAmount > 100)
                return -1;
            else
                tonerLevel += tonerAmount;
        }
        else
        {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pagesToPrint) {

        if(this.duplex) {
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted()
    {
        return pagesPrinted;
    }


}
