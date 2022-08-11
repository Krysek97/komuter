package file.musicfile;

import file.FileType;

public class MP3 extends AbstractMusic {

    private int quality;

    public MP3(String name, int size, int quality) {
        super(name, size);
        this.quality = quality;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public FileType getType() {
        return super.getType();
    }

    @Override
    public String getPlay() {
        return super.getPlay();
    }

    public int getQuality() {
        return quality;
    }
}
