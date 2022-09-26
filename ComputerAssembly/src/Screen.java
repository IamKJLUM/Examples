public class Screen {

    private final String model;
    private final String vendor;
    private final DIAGONAL diagonal;
    private final double screenWeight;
    private final SCREEN_TYPE screenType;

    public Screen(String vendor, String model, double screenWeight, DIAGONAL diagonal, SCREEN_TYPE screenType) {

        this.model = model;
        this.vendor = vendor;
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;

        Computer.setToString("\n ЭКРАН" + "\n" +
                " Диагональ экрана ______________ " + getDiagonal() + "\n" +
                " Тип экрана ____________________ " + getScreenType() + "\n" +
                " Вес экрана ____________________ " + getScreenWeight() + "\n");
    }

    enum DIAGONAL {
        A(8), B(12), C(24);

        DIAGONAL(int d) {
        }
    }

    enum SCREEN_TYPE {
        TYPE_IPS,
        TYPE_TN,
        TYPE_VA
    }

    private DIAGONAL getDiagonal() {
        return diagonal;
    }

    private SCREEN_TYPE getScreenType() {
        return screenType;
    }

    public double getScreenWeight() {
        return this.screenWeight;
    }

}
