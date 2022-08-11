package file.musicfile;

import file.File;
import file.FileType;

public abstract class AbstractMusic implements File {

    protected String name;
    protected int size;
    protected String play;

    public AbstractMusic(String name, int size) {
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
        return FileType.MUSIC;
    }

    public String getPlay() {
        System.out.println(name + " is playing");
        return play;
    }
}
