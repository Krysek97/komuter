package file.imagefile;

public class JPG extends AbstractImage {

    private int compression;

    public JPG(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }
}
