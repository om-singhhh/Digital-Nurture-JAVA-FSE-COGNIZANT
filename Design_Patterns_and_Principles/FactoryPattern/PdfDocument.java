package Design_Patterns_and_Principles.FactoryPattern;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("PDF Document Opened.");
    }
}