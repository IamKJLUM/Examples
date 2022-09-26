public class Main {
    public static void main(String[] args) {

        Computer comp = new Computer("name1", "HP");
        comp.setKeyboard(
                new Keyboard(
                        "vendor",
                        "model",
                        2212,
                        Keyboard.TYPE.MECHANICAL,
                        true));
        comp.setStorageInformation(new StorageInformation("wefwef", "wefwfe", 2001, StorageInformation.STORAGE_TYPE.HDD, StorageInformation.MEMORY_VOLUME.C));
        comp.setProcessor(new Processor("ferf", "wef", 2002, Processor.GHZ.A, Processor.PROCESSOR_MANUFACTURER.INTEL));
        comp.setRam(new Ram("afe", "ewf", 2005, Ram.RAM_TYPE.GDDR3, Ram.RAM_VOLUME.A));
        comp.setScreen(new Screen("wfwef", "ewfwef", 2010, Screen.DIAGONAL.C, Screen.SCREEN_TYPE.TYPE_IPS));

        Computer com = new Computer("edw", "qwef");
        com.setKeyboard(new Keyboard("efw", "fwef", 1212, Keyboard.TYPE.MEMBRANE, false));
        com.setStorageInformation(new StorageInformation("wefwef", "wefwfe", 1001, StorageInformation.STORAGE_TYPE.HDD, StorageInformation.MEMORY_VOLUME.C));
        com.setProcessor(new Processor("ferf", "wef", 1002, Processor.GHZ.A, Processor.PROCESSOR_MANUFACTURER.INTEL));
        com.setRam(new Ram("afe", "ewf", 1005, Ram.RAM_TYPE.GDDR3, Ram.RAM_VOLUME.A));
        com.setScreen(new Screen("wfwef", "ewfwef", 1010, Screen.DIAGONAL.C, Screen.SCREEN_TYPE.TYPE_IPS));

        System.out.println(Computer.getToString()
                + " Общий вес компуктера __________ " + com.getWeight()
                + "\n Общий вес компуктера __________ " + comp.getWeight()
        );
    }
}
