package strategy;

public class TextFileProcessor implements FileProcessingStrategy {
    public void processFile(String filename) {
        System.out.println("Processing TEXT file: " + filename);
    }
}
