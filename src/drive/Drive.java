package drive;

import file.File;

public interface Drive {
    void addFile(File file);

    void listFile();

    file.File findFile(String name);


}
