package strategy;

import adapter.JpegImageProcessor;
import adapter.JpegImageProcessorAdapter;

import java.util.Scanner;

public class Main {

    static private FileProcessingStrategy getFileProcessingStrategy(String filename) throws Exception {
        if (filename.endsWith(".txt")) {
            return new TextFileProcessor();
        } else if (filename.endsWith(".csv")) {
            return new CsvFileProcessor();
        } else if (filename.endsWith(".jpeg")) {
            return new JpegImageProcessorAdapter(new JpegImageProcessor());
        }
        throw new Exception("Unsupported file type");
    }
    public static void main(String[] args) {
        System.out.println("Enter file name: ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        FileProcessingStrategy strategy;
        try {
            strategy = getFileProcessingStrategy(filename);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        strategy.processFile(filename);
    }
}
