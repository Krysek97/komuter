package drive;

import file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SDDDrive implements Drive {

    Map<String, File> files = new HashMap<>();


    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFile() {
        Collection<File> filesCollection = files.values();

        for (File file : filesCollection) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }
}