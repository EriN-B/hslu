package ch.hslu.sw02;

import java.util.HashMap;
import java.util.Map;

public class Aggregate {
    private static final Map<String, Double[]> ELEMENT_PROPERTIES = new HashMap<>();

    static {
        ELEMENT_PROPERTIES.put("N", new Double[]{63.15, 77.0});
        ELEMENT_PROPERTIES.put("Hg", new Double[]{234.15, 630.0});
        ELEMENT_PROPERTIES.put("Pb", new Double[]{600.15, 2022.0});
    }

    public static String getState(String element, float temperatureKelvin) {
        Double[] properties = ELEMENT_PROPERTIES.get(element);
        if (properties == null) {
            return "Unknown Element";
        }

        double meltingPoint = properties[0];
        double boilingPoint = properties[1];

        if (temperatureKelvin < meltingPoint) {
            return "solid";
        } else if (temperatureKelvin < boilingPoint) {
            return "liquid";
        } else {
            return "gas";
        }
    }
}
