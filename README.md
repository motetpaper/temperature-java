# temperature-java
simple temperature conversion Java library

> [!IMPORTANT]
> **This is a Java source repo.** The `docs/` folder is the location of the javadoc (documentation). The versioned JAR file will be available in releases.

```java

// negative Kelvin temperature
double t = -23.232323;

// gracefully clamped at absolute zero
// keeps precision
System.out.println((new Kelvin(t).getValue()));

// nicely displayed with units in Kelvin
System.out.println((new Kelvin(t)));

// converted to Rankine with precision
System.out.println((new Kelvin(t)).toRankine());

// nicely displayed with units in degrees Rankine
System.out.println((new Kelvin(t)).asRankine());
```
