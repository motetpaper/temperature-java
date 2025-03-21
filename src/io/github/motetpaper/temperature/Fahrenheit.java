package io.github.motetpaper.temperature;

/**
 * Represents the Fahrenheit temperature scale.
 *
 * @author MOTETPAPER
 * @version 1.1
 */
public final class Fahrenheit implements Temperature {

    double value = Temperature.ZERO_R;
    String units = "°F";

    //
    // construction zone, SLOW DOWN
    //
    //
    //
    public Fahrenheit() {
        // empty        
    }

    public Fahrenheit(double aValue) {
        this.setValue(aValue);
    }

    /**
     * Returns a decimal-formatted string with temperature value and units.
     *
     * @return temperature in degrees with units of Fahrenheit
     */
    @Override
    public String toString() {
        return String.valueOf(Temperature.df.format(this.value)) + this.units;
    }

    //
    // getters and setters
    //
    //
    //
    /**
     *
     * @return
     */
    @Override
    public double getValue() {
        return this.value;
    }

    /**
     * Sets the temperature value, expecting values at or above absolute zero.
     *
     * @param aValue a temperature value
     * @return <code>Fahrenheit</code>, this object
     * @see io.github.motetpaper.temperature.Temperature#setValue(double)
     */
    @Override
    public final Fahrenheit setValue(double aValue) {

        if (aValue < Temperature.ZERO_R) {
            System.err.println("BELOW ABSOLUTE ZERO!");
            System.err.println("Setting value to absolute zero.");
            this.value = Temperature.ZERO_R;
        } else {
            this.value = aValue;
        }

        return this;
    }

    //
    // .toTemperature methods area
    //
    //
    //
    /**
     * Returns the temperature value converted to the Kelvin scale
     *
     * @return temperature in degrees Kelvin
     */
    @Override
    public double toKelvin() {
        return this.toCelsius() - Temperature.ZERO_K;
    }

    /**
     * Returns the temperature value converted to the Celsius scale
     *
     * @return temperature in degrees Celsius
     */
    @Override
    public double toCelsius() {
        return (1.0 / 1.8) * (this.toFahrenheit() - Temperature.ZERO_C);
    }

    /**
     * Returns the temperature value converted to the Fahrenheit scale
     *
     * @return temperature in degrees Fahrenheit
     */
    @Override
    public double toFahrenheit() {
        return this.value;
    }

    /**
     * Returns the temperature value converted to the Rankine scale
     *
     * @return temperature in degrees Rankine
     */
    @Override
    public double toRankine() {
        return this.toFahrenheit() - Temperature.ZERO_R;
    }

    //
    // .asTemperature Methods area
    //
    /**
     * Returns the Temperature value within a Kelvin object
     *
     * @return the Kelvin object
     */
    @Override
    public Kelvin asKelvin() {
        return new Kelvin(this.value);
    }

    /**
     * Returns the Temperature value within a Celsius object
     *
     * @return the Celsius object
     */
    @Override
    public Celsius asCelsius() {
        return new Celsius(this.toCelsius());
    }

    /**
     * Returns the Temperature value within a Fahrenheit object
     *
     * @return the Fahrenheit object
     */
    @Override
    public Fahrenheit asFahrenheit() {
        return new Fahrenheit(this.toFahrenheit());
    }

    /**
     * Returns the Temperature value within a Rankine object
     *
     * @return the Rankine object
     */
    @Override
    public Rankine asRankine() {
        return new Rankine(this.toRankine());
    }
}
