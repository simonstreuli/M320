public class HeizungTest {

    public static void main(String[] args) {

        Heizung heizung1 = new Heizung(10, 30);


        heizung1.waermerMachen(50);

        heizung1.kaelterMachen(10);

        heizung1.waermerMachen(20);

        System.out.println("Aktuelle Temperatur: " + heizung1.getTemperature());

    }

}
