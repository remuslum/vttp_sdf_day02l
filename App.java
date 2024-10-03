import java.util.ArrayList;
import java.util.List;

import object.Computer;
import object.Desktop;
import object.Laptop;

public class App {
    public static void main(String[] args) {
        
        Computer computer = new Computer();
        computer.setCPU("5GHz 8 core");
        computer.setModel("Asus 8000");
        computer.setRAM(32);
        computer.setYear(2024);

        computer.start();
        computer.displaySpec();
        computer.shutDown();

        Computer computer2 = new Computer();
        computer2.start();
        computer2.displaySpec();
        computer2.shutDown();

        Laptop laptop1 = new Laptop();
        laptop1.setCPU("10Ghz 128 core");
        laptop1.setModel("Asus 12000");
        laptop1.setRAM(64);
        laptop1.setYear(2024);
        laptop1.setBattery("11.1V 3S LIPO");
        laptop1.setOperatingSystem("Windows 11 Professional");
        laptop1.setScreenSize("15.4 inch OLED");
        laptop1.start();
        laptop1.displaySpec();
        laptop1.shutDown();

        Desktop desktop1 = new Desktop("4GHz 8 core", "Alibaba", 16, 2024, "Ubuntu 20.4 LTS", 5, true);
        desktop1.start();
        desktop1.displaySpec();
        desktop1.shutDown();
        
        List<Computer> machines = new ArrayList<>();
        machines.add(desktop1);
        machines.add(computer);
        machines.add(computer2);
        machines.add(laptop1);

        // For statement to display machines
        for (Computer machine : machines) {
            machine.displaySpec();
        }
    }
}
