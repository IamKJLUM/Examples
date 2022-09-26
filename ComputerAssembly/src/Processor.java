public class Processor {

    private final GHZ ghz;
    private final String model;
    private final String vendor;
    private final double processorWeight;
    private final PROCESSOR_MANUFACTURER processor_manufacturer;

    public Processor (String vendor, String model, double processorWeight, GHZ ghz, PROCESSOR_MANUFACTURER processor_manufacturer) {

        this.ghz = ghz;
        this.model = model;
        this.vendor = vendor;
        this.processorWeight = processorWeight;
        this.processor_manufacturer = processor_manufacturer;

        Computer.setToString(
                "\n ПРОЦЕССОР" +  "\n" +
                        " Частота процессора(Hz) ________ " + getGhz() + "\n" +
                        " Вендор процессора _____________ " + getProcessor_manufacturer() + "\n" +
                        " Вес процессора ________________ " + getProcessorWeight() + "\n"
        );
    }

    enum GHZ {
        A(3400),B(3900),C(4000);
        GHZ(int hz) {
        }
    }

    enum PROCESSOR_MANUFACTURER {
        AMD,INTEL
    }

    private GHZ getGhz() {
        return ghz;
    }

    private PROCESSOR_MANUFACTURER getProcessor_manufacturer() {
        return processor_manufacturer;
    }

    public double getProcessorWeight() {
        return this.processorWeight;
    }

}
