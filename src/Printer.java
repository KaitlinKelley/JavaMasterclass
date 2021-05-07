public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount <= 0 || tonerAmount > 100){
            return -1;
        }else{
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
        }

        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(!duplex){
            this.pagesPrinted += pages;
            return pagesToPrint;
        }else{
            this.pagesPrinted += (pagesToPrint/2 + pagesToPrint%2);
            return pagesToPrint/2 + pagesToPrint%2;
        }
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());

    }
}
