package file.imagefile;

public class GIF extends AbstractImage {

    public GIF(String name, int size) {
        super(name, size);
    }

    public void showAnimation(){
        System.out.println("Showing funny GIF");
    }
}
