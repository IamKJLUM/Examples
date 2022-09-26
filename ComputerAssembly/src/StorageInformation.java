public class StorageInformation {

    private final String model;
    private final String vendor;
    private final STORAGE_TYPE type;
    private final MEMORY_VOLUME volume;
    private final double storageWeight;

    public StorageInformation(String vendor, String model, double storageWeight,
                              STORAGE_TYPE type, MEMORY_VOLUME volume) {

        this.type = type;
        this.model = model;
        this.volume = volume;
        this.vendor = vendor;
        this.storageWeight = storageWeight;


        Computer.setToString("\n НАКОПИТЕЛЬ"+ "\n" +
                " Тип накопителя _________________ " + getStorageType() + "\n" +
                " Объем накопителя _______________ " + getVolume() + "\n" +
                " Вес накопителя _________________ " + getStorageWeight() + "\n");
    }

    enum STORAGE_TYPE{
        HDD,SSD
    }

    enum MEMORY_VOLUME{
        A(128),B(256),C(1024);
        MEMORY_VOLUME(int volume){}
    }

    private STORAGE_TYPE getStorageType() {
        return type;
    }

    private MEMORY_VOLUME getVolume() {
        return volume;
    }

    public double getStorageWeight(){
        return this.storageWeight;
    }

}
