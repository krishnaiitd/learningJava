package memory.escaping.references;

import java.util.HashMap;
import java.util.Map;

public class Price {
    private Map<String,Double> rates;
    private Double value;

    public Price(Double value) {
        this.value = value;
        rates = new HashMap<String,Double>();
        rates.put("USD", 1d);
        rates.put("GBP", 0.6);
        rates.put("EUR", 0.8);
    }

    // TODO: We appear to be mutating a value in a get method
    public Double convert(String toCurrency) {

        if (toCurrency.equals("USD")) {
            return value;
        }
        else {
            Double conversion = rates.get("USD") / rates.get(toCurrency);
            // Below two line will changes the value of 'value' in the price object and it will mutating the value every time it called
//            value = conversion * value;
//            return value;

            return conversion * value; // this will fixed the issue.
        }
    }

    public String toString() {
        return this.value.toString();
    }

    // Definitely a escaping reference
    public Map<String,Double> getRates() {
        return rates;
    }

    // This method has no escaping reference, Solution of above one, double are already immutable.
    public Double getRates(String currency) {
        return rates.get(currency);
    }


}
