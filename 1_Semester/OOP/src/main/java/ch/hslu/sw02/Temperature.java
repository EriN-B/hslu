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

    /**
     *
     * @param element
     * @return The aggregate state of an elements at the current temperature
     */
    public String getAggregateState(String element){
        return Aggregate.getState(element, temperature);
    }

    private float convertToCelsius(){
        return (temperature - 273.15F);
    }

    private float convertToFahrenheit() {
        return (temperature - 273.15F) * ((float) 9 / 5) + 32;
    }
}
