public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(293.15F);
        System.out.println(temperature.getTemperature(Unit.CELSIUS));
    }
}