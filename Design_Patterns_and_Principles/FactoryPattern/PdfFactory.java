package Design_Patterns_and_Principles.FactoryPattern;

public class PdfFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}