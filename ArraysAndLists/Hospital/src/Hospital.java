import java.text.DecimalFormat;
import java.util.StringJoiner;

public class Hospital {

        public static float[] generatePatientsTemperatures(int patientsCount) {
            float [] patientsTemperatures = new float[patientsCount];

            for (int i = 0; i < patientsTemperatures.length; i++) {
                patientsTemperatures[i] = ((float) Math.random() * 8) + 32;

            }

            return patientsTemperatures;
        }

        public static String getReport(float[] temperatureData) {

            StringJoiner temperAllPatients = new StringJoiner(" ");
            float mediumTemperatures = 0;
            int healthyPatients = 1;

            for (int i = 0; i < temperatureData.length; i++) {
                mediumTemperatures = mediumTemperatures + temperatureData[i];
                temperAllPatients.add(new DecimalFormat("##.#").format(temperatureData[i]));

                if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
                    healthyPatients++;
                }
            }

            String report =
                    "Температуры пациентов: " + temperAllPatients +
                            "\nСредняя температура: " + new DecimalFormat("##.##").format(mediumTemperatures / temperatureData.length) +
                            "\nКоличество здоровых: " + healthyPatients;

            return report;

    }
}
