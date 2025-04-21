package io.github.motetpaper.temperature;

import java.text.DecimalFormat;

/**
 * Represents Temperature scales and conversions
 *
 * @author MOTETPAPER
 * @version 1.1.1
 */
public interface Temperature {

    // decimal formatted to the hundreths place (0.00)
    public static final DecimalFormat df = new DecimalFormat("#.##");

    // the units are degrees Fahrenheit
    public static final double ZERO_R = -459.67D;

    // the units are degrees Celsius
    public static final double ZERO_K = -273.15D;

    // the units are degrees Fahrenheit
    public static final double ZERO_C = 32.0D;

    // the ratio that converts Celsius to Fahrenheit ( F = (9/5)*C + 32
    public static final double CFRATIO = 9.0 / 5.0D;

    /**
     * Returns decimal-formatted string representation of this object with
     * units.
     * <p>
     * A few words about implementation. The precision of the input value is
     * preserved, and available in the .getValue() method.
     * <p>
     * The ".as" methods (e.g., .asCelsius()) creates new Temperature objects
     * allowing the use of .toString() to return the values as decimal-formatted
     * strings (as specified in the Temperature interface), along with familiar
     * temperature scale units.
     * <p>
     * EXAMPLE: "25°C"
     *
     * @return decimal-formatted value with units.
     */
    @Override
    public String toString();

    /**
     * Returns the input (set) value of the Temperature object.
     * <p>
     * This preserve the precision. If you want decimal-formatted output, use
     * .toString instead.
     *
     * @return the Temperature value
     */
    public double getValue();

    /**
     * Sets the value for this <code>Temperature</code> object; then, returns
     * this object.
     * <p>
     * Most users of this package will only deal with temperatures at or above
     * absolute zero. To that point, any value below absolute zero is beyond the
     * scope of this object's model.
     * <p>
     * This function expects a valid temperature value at or above absolute
     * zero. If the input value is less than absolute zero, the value will be
     * clamped at absolute zero. A warning will be printed using
     * <code>System.err</code>
     *
     * @param aValue a valid temperature above absolute zero
     * @return this Temperature object
     */
    public Temperature setValue(double aValue);

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
    public double toKelvin();

    /**
     * Returns the temperature value converted to the Celsius scale
     *
     * @return temperature in degrees Celsius
     */
    public double toCelsius();

    /**
     * Returns the temperature value converted to the Fahrenheit scale
     *
     * @return temperature in degrees Fahrenheit
     */
    public double toFahrenheit();

    /**
     * Returns the temperature value converted to the Rankine scale
     *
     * @return temperature in degrees Rankine
     */
    public double toRankine();

    //
    // the .asTemperature methods area
    //
    //
    //
    /**
     * Returns the Temperature value within a Kelvin object
     *
     * @return the Kelvin object
     */
    public Kelvin asKelvin();

    /**
     * Returns the Temperature value within a Celsius object
     *
     * @return the Celsius object
     */
    public Celsius asCelsius();

    /**
     * Returns the Temperature value within a Fahrenheit object
     *
     * @return the Fahrenheit object
     */
    public Fahrenheit asFahrenheit();

    /**
     * Returns the Temperature value within a Rankine object
     *
     * @return the Rankine object
     */
    public Rankine asRankine();
}
