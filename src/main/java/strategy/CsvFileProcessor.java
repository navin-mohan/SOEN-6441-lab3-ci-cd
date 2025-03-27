package strategy;

public class CsvFileProcessor implements FileProcessingStrategy {
    public void processFile(String filename) {
        System.out.println("Processing CSV file: " + filename);
    }
}
