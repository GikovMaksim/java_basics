public class Printer {
    String queue = "";
    int notPrintedPages = 0;
    int documentsToPrint = 0;
    int printedDocuments = 0;
    int printedPages = 0;

    public void append(String textOfDocument, String nameOfDocument, int pageCount){
        queue = queue + nameOfDocument + "\n" + textOfDocument+ "\n";
        notPrintedPages += pageCount;
        documentsToPrint += 1;
    }

    public void append(String textOfDocument, String nameOfDocument){
        append(textOfDocument,nameOfDocument, 1);
    }

    public void append(String textOfDocument){
        append(textOfDocument, "noName",1);
    }

    public void clear(){
        queue = "";
    }

    public void print(){
        System.out.println(queue);
        this.printedDocuments += documentsToPrint;
        this.printedPages += notPrintedPages;
        this.clear();
        this.notPrintedPages = 0;
        this.documentsToPrint = 0;
    }

    public int getPagesCount(){
        return notPrintedPages;
    }

    public int everPrinted(){
        return printedPages + printedDocuments;
    }
}
