package usbdevice.printer;

import usbdevice.USBDevice;

import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Printer implements USBDevice {

    private String name;
    private boolean printing;
    private String wantPrinting;
    private int numberOfSheets;
    private int numberOfPages;

    List<Ink> inks = new ArrayList<>();


    public Printer(String name) {
        this.name = name;
    }

    public void setPages() {
        int additionalPaperSheets;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pages do you want to print?");
        numberOfPages = scanner.nextInt();
        System.out.println("Insert paper sheets.");
        numberOfSheets = scanner.nextInt();
        while (numberOfPages > numberOfSheets) {
            System.out.println("You want to print " + numberOfPages + " but you insert only " + numberOfSheets + " paper sheets. Please insert more paper sheets.");
            additionalPaperSheets = scanner.nextInt();
            numberOfSheets = numberOfSheets + additionalPaperSheets;
        }
        System.out.println("Starting printing.");
    }

    public void putCartridges() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> orderNames = new HashMap<>() {{
            put(1, "first");
            put(2, "second");
            put(3, "third");
            put(4, "fourth");
        }};
        String color;
        System.out.println("Put on cartridges");
        for (int i = 1; i < 5; i++) {
            System.out.println("Insert " + orderNames.get(i) + " color");
            color = scanner.nextLine();
        }
        setPages();
    }


    @Override
    public boolean connect() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Printer is connected. Do you want to print?");
        wantPrinting = scanner.nextLine();
        printing = wantPrinting.equals("yes");
        if (printing) {
            putCartridges();
        }
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Printer is disconnected");
        return true;
    }

    @Override
    public String getName() {
        return null;
    }
}
