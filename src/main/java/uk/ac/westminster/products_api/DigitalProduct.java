package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(String downloadUrl, double fileSizeMB, long id, String name, double price) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
