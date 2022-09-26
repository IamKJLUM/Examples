public class Computer {

    private final String nameComputer;
    private final String vendorComputer;
    private static String toString = "";

    private Ram ram;
    private Screen screen;
    private Keyboard keyboard;
    private Processor processor;
    private StorageInformation storageInformation;

    public Computer(String nameComputer, String vendorComputer) {
        this.nameComputer = nameComputer;
        this.vendorComputer = vendorComputer;
        setToString(
                  "\n Название Компьютера ___________ " + nameComputer
                + "\n Производитель Компьютера ______ " + vendorComputer
                );
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setRam(Ram ram){
        this.ram = ram;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setStorageInformation (StorageInformation storageInformation){
        this.storageInformation = storageInformation;
    }

    public double getWeight() {
        return
                this.ram.getRamWeight() +
                        this.screen.getScreenWeight() +
                        this.keyboard.getKeyboardWeight() +
                        this.processor.getProcessorWeight() +
                        this.storageInformation.getStorageWeight();
    }

    public Ram getRam() {
        return this.ram;
    }

    public Screen getScreen() {
        return this.screen;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    public StorageInformation getStorageInformation() {
        return this.storageInformation;
    }

    public static void setToString(String setToString) {
        Computer.toString = toString + setToString + "\n";
    }

    public static String getToString() {
            return toString;
    }
}
