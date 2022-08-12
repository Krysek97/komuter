package usbdevice.camera;

import usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camera implements USBDevice {

    private String name;
    private boolean recording;
    List<String> resolutions = new ArrayList<>();

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Camera is connected.");
        recording();
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Camera is disconnected.");
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void recording() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to start recording?");
        String record = scanner.nextLine();
        this.recording = record.equals("yes");
        if (this.recording) {
            resolutionOfVideo();
        }
    }

    public void resolutionOfVideo() {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        System.out.println("Choose resolution of video:");
        System.out.println("1. 360p");
        System.out.println("2. 480p");
        System.out.println("3. 720p HD");
        System.out.println("4. 1080p HD");
        System.out.println("5. 2k Ultra HD");
        userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1 -> this.resolutions.add(360 + "p");
            case 2 -> this.resolutions.add(480 + "p");
            case 3 -> this.resolutions.add(720 + "p HD");
            case 4 -> this.resolutions.add(1080 + "p HD");
            case 5 -> this.resolutions.add(2 + "k Ultra HD");
        }

        for (String resolution : resolutions) {
            System.out.println("Staring recording. Currently resolution " + this.resolutions);
        }
    }
}
