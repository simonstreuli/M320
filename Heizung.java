public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int min, int max) {
        this.temperature = 15;
        this.min = min;
        this.max = max;
    }

    public void waermerMachen(int increment) {
        if (temperature + increment <= max) {
            temperature += increment;
            System.out.println("Temperatur erhöht auf: " + temperature);
        } else {
            System.out.println("Maximale Temperatur erreicht.");
        }
    }

    public void kaelterMachen(int increment) {
        if (temperature - increment >= min) {
            temperature -= increment;
            System.out.println("Temperatur gesenkt auf: " + temperature);
        } else {
            System.out.println("Minimale Temperatur erreicht.");
        }
    }

    public int getTemperature() {
        return temperature;
    }


}