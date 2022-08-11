import drive.Drive;
import drive.HDDDrive;
import file.musicfile.MP3;
import usbdevice.MemoryStick;
import usbdevice.printer.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("mana");

        printer.connect();
    }
}
