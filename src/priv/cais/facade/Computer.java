package priv.cais.facade;

public class Computer {
    private Memory memory;
    private Disk disk;

    public Computer(){
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("Start the computer!");
        memory.startup();
        disk.startup();
        System.out.println("Computer started!");
    }

    public void shutdown(){
        System.out.println("Close the computer!");
        memory.shutdown();
        disk.shutdown();
        System.out.println("Computer closed!");
    }
}