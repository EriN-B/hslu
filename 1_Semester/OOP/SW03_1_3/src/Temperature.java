public class Temperature {

    private float temperature = 20.0F;

    /**
     * @param temperature (KELVIN)
     */
    public Temperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * @param temperature (KELVIN)
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * @param unit
     * @return temperature in specified unit
     */
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
