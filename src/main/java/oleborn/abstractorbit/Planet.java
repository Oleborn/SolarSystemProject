package oleborn.abstractorbit;

import oleborn.utils.Utils;

import java.awt.*;

public abstract class Planet extends CelestialBody{

    protected double centerOrbitX, centerOrbitY;
    protected double majorAxis, minorAxis;

    public Planet(double orbitalSpeed, int radiusCelestialBody, int majorAxis, double minorAxis, double eccentricity) {
        super(orbitalSpeed, radiusCelestialBody);
        this.centerOrbitX = Utils.calculationCenterOrbitForSun(majorAxis, eccentricity).get(0);
        this.centerOrbitY = Utils.calculationCenterOrbitForSun(majorAxis, eccentricity).get(1);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void updatePosition() {
        x = centerOrbitX + majorAxis * Math.cos(angle);
        y = centerOrbitY + minorAxis * Math.sin(angle);
    }


    public void draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }
}
