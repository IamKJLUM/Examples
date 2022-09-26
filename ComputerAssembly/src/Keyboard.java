public class Keyboard {

    private final String model;
    private final String vendor;
    private final boolean backLight;
    private final TYPE type;
    private final double keyboardWeight;

    public Keyboard(String vendor, String model, double keyboardWeight, TYPE type, boolean backLight) {

        this.type = type;
        this.model = model;
        this.vendor = vendor;
        this.backLight = backLight;
        this.keyboardWeight = keyboardWeight;

        Computer.setToString(
                "\n КЛАВИАТУРА" + "\n" +
                        " Тип клавиатуры ________________ " + getType() + "\n" +
                        " Наличие подсветки клавиатуры __ " + getBACKLIGHT() + "\n" +
                        " Вес клавиатуры ________________ " + keyboardWeight + "\n");
    }

    enum TYPE {
        MECHANICAL, MEMBRANE
    }

    private String getBACKLIGHT() {
        if (backLight) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    private TYPE getType() {
        return type;
    }

    public double getKeyboardWeight() {
        return this.keyboardWeight;
    }
}


