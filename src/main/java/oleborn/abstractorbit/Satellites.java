package oleborn.abstractorbit;

import java.awt.*;

public abstract class Satellites extends CelestialBody{

    protected double hostX, hostY;

    protected double radiusOrbit;

    public Satellites(double orbitMajorX, double orbitalSpeed, int radiusSatellite) {
        super(orbitalSpeed, radiusSatellite);
        this.radiusOrbit = orbitMajorX;
    }

    public void move(double hostX, double hostY) {
        this.hostX = hostX;
        this.hostY = hostY;
        super.move();
    }

    @Override
    public void updatePosition() {
        x = hostX + radiusOrbit * Math.cos(angle);
        y = hostY + radiusOrbit * Math.sin(angle);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }
}
