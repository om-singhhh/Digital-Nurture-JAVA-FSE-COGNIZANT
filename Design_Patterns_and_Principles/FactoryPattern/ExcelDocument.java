package Design_Patterns_and_Principles.FactoryPattern;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Excel Document Opened.");
    }
}