package oleborn.utils;

public enum CelestialsUtils {
    MERCURY(0.387, 0.206, 47.87, CelestialType.PLANET),
    VENUS(0.723, 0.007, 35.02, CelestialType.PLANET),
    EARTH(1, 0.017, 29.76, CelestialType.PLANET),
    MARS(1.52, 0.093, 24.13, CelestialType.PLANET),
    JUPITER(5.2, 0.048, 13.07, CelestialType.PLANET),

    MOON(0.00257*20, 0.0549, 1.35*200, CelestialType.SATELLITES),

    DAIMYOS(0.000156*500, 0.0002, 1.35*500, CelestialType.SATELLITES),
    FOBOS(0.0000626*500, 0.0151, 2.14*500, CelestialType.SATELLITES),

    IO(0.00282*20, 0.0041, 17.334*20, CelestialType.SATELLITES),
    EUROPA(0.00449*20, 0.0094, 13.74*20, CelestialType.SATELLITES),
    GANYMEDE(0.00716*20, 0.0013, 10.878*20, CelestialType.SATELLITES),
    CALLISTO(0.01259*20, 0.0074, 8.204*20, CelestialType.SATELLITES);

    private final int orbitMajorAxis;
    private final double orbitEccentricity;
    private final int orbitMinorAxis;
    private final double orbitSpeed;
    private final CelestialType celestialType;

    CelestialsUtils(double orbitMajorAxisFactor, double orbitEccentricityFactor, double orbitSpeed, CelestialType celestialType) {
        this.orbitMajorAxis = (int) (Utils.DEFAULT_SIZE * orbitMajorAxisFactor);
        this.orbitEccentricity = orbitEccentricityFactor;
        this.orbitSpeed = 0.00003 * orbitSpeed;
        this.celestialType = celestialType;
        this.orbitMinorAxis = calculationMinorAxis(orbitMajorAxis, orbitEccentricity);
    }

    public int getOrbitMajorAxis() {
        return orbitMajorAxis;
    }

    public double getOrbitEccentricity() {
        return orbitEccentricity;
    }

    public int getOrbitMinorAxis() {
        return orbitMinorAxis;
    }

    public double getOrbitSpeed() {
        return orbitSpeed;
    }

    public CelestialType getCelestialType() {
        return celestialType;
    }

    private static int calculationMinorAxis(int orbitMajorAxis, double orbitEccentricity) {
        return (int) (orbitMajorAxis * Math.sqrt(1-orbitEccentricity * orbitEccentricity));
    }
}
