package adapter;

public class JpegImageProcessorAdapter implements strategy.FileProcessingStrategy {
    private JpegImageProcessor jpegImageProcessor;

    public JpegImageProcessorAdapter(JpegImageProcessor jpegImageProcessor) {
        this.jpegImageProcessor = jpegImageProcessor;
    }

    public void processFile(String filename) {
        System.out.println("Processing JPEG image thorugh the adapter: " + filename);
        jpegImageProcessor.processImage(filename);
    }
}
