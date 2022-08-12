import drive.Drive;
import drive.HDDDrive;
import file.musicfile.MP3;
import usbdevice.MemoryStick;
import usbdevice.camera.Camera;
import usbdevice.printer.Printer;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera("Lotka");

        camera.connect();

    }
}
