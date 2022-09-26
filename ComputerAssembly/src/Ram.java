public class Ram {

    private final String model;
    private final String vendor;
    private final double ramWeight;
    private final RAM_TYPE ramType;
    private final RAM_VOLUME ramVolume;

    public Ram(String vendor, String model, double ramWeight, RAM_TYPE ramType, RAM_VOLUME ramVolume) {

        this.model = model;
        this.vendor = vendor;
        this.ramType = ramType;
        this.ramWeight = ramWeight;
        this.ramVolume = ramVolume;

        Computer.setToString("\n ОПЕРАТИВНАЯ ПЯМЯТЬ" + "\n" +
                " Тип оперативной памяти ________ " + getRamType() + "\n" +
                " Объем оперативной памяти ______ " + getRamVolume() + "\n" +
                " Вес оперативной памяти ________ " + getRamWeight() + "\n");
    }

    enum RAM_TYPE {
        GDDR5,GDDR3,GDDR2
    }

    enum RAM_VOLUME {
        A(4),B(8),C(16);
        RAM_VOLUME(int volume) {
        }
    }

    private RAM_TYPE getRamType() {
        return ramType;
    }

    private RAM_VOLUME getRamVolume() {
        return ramVolume;
    }

    public double getRamWeight() {
        return this.ramWeight;
    }

}
