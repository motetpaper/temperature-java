# temperature-java
simple temperature conversion Java library

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

// nicely displayed with units in Rankine scale
System.out.println((new Kelvin(t)).asRankine());
```
