package ch.hslu.sw02;

public class Temperature {

    private float temperature = 20.0F;

    public Temperature(float temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature(Unit unit) {
        switch (unit){
            case CELSIUS -> {
                return convertToCelsius();
            }
            case FAHRENHEIT -> {
                return convertToFahrenheit();
            }
            default -> {
                return temperature;
            }
        }
    }

    private float convertToCelsius(){
        return (temperature - 273.15F);
    }

    private float convertToFahrenheit() {
        return (temperature - 273.15F) * ((float) 9 / 5) + 32;
    }
}
