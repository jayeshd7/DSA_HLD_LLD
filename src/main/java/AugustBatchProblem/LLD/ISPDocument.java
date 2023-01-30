package AugustBatchProblem.LLD;

public class ISPDocument {
    public static void main(String[] args) {
        Machine m = new MultiFunctionPrinter();
        m.print(new ISPDocument());
        m.scan(new ISPDocument());
        m.fax(new ISPDocument());
        Printer p = new OldFashionedPrinter();
        p.print(new ISPDocument());
        //p.scan(new ISPDocument());
        //p.fax(new ISPDocument());
        JustAPrinter j = new JustAPrinter();
        j.print(new ISPDocument());
        j.scan(new ISPDocument());
        //j.fax(new ISPDocument());
    }
}

interface Machine{
    void print(ISPDocument doc);
    void scan(ISPDocument doc);
    void fax(ISPDocument doc);
}

class MultiFunctionPrinter implements Machine{
    @Override
    public void print(ISPDocument doc) {
        System.out.println("Printing");
    }

    @Override
    public void scan(ISPDocument doc) {
        System.out.println("Scanning");
    }

    @Override
    public void fax(ISPDocument doc) {
        System.out.println("Faxing");
    }
}

class OldFashionedPrinter implements Printer{
    @Override
    public void print(ISPDocument doc) {
        System.out.println("Printing");
    }


}

interface Printer{
    void print(ISPDocument doc);
}
interface Scanner{
    void scan(ISPDocument doc);
}
interface Fax{
    void fax(ISPDocument doc);
}
//YAGNI - You aren't gonna need it
class JustAPrinter implements Printer, Scanner{
    @Override
    public void print(ISPDocument doc) {
        System.out.println("Printing");
    }

    @Override
    public void scan(ISPDocument doc) {
        System.out.println("Scanning");
    }
}

interface MultiFunctionDevice extends Printer, Scanner{

}

class MultiFunctionMachine implements MultiFunctionDevice{
    @Override
    public void print(ISPDocument doc) {
        System.out.println("Printing");
    }

    @Override
    public void scan(ISPDocument doc) {
        System.out.println("Scanning");
    }
}