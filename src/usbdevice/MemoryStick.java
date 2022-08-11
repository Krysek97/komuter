package usbdevice;

import file.File;

import java.util.ArrayList;
import java.util.List;

public class MemoryStick implements USBDevice {

    String name;

    public MemoryStick(String name) {
        this.name = name;
    }

    private boolean ejected = false;
    List<File> files = new ArrayList<>();

    public void saveFileOnMemoryStick(File file) {
        files.add(file);
    }

    public void showFilesFromMemoryStick() {
        for (File filesList : files) {
            System.out.println(filesList.getName());
        }
    }

    @Override
    public boolean connect() {
        System.out.println("Pendrive connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Please eject pendrive first.");
            return false;
        } else {
            System.out.println("Pendrive disconnected");
            return true;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean setEjected(){
        return ejected = true;
    }
}
