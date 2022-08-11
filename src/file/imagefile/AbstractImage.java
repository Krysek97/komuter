package file.imagefile;

import file.File;
import file.FileType;


public abstract class AbstractImage implements File {
    protected String name;
    protected int size;

    public AbstractImage(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
