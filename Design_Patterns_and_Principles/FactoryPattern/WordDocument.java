package Design_Patterns_and_Principles.FactoryPattern;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Word Document Opened.");
    }
}