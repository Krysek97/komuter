package file;

public abstract class FileAbstract implements File {
    protected String name;
    protected int size;

    public FileAbstract(String name, int size) {
        this.name = name;
        this.size = size;
    }


}
