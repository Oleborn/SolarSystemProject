package oleborn.abstractorbit;

import java.awt.*;

public abstract class CelestialBody extends Orbits {

    public double x, y;
    public double angle;
    public double orbitalSpeed;
    public int radiusCelestialBody;

    public CelestialBody(double orbitalSpeed, int radiusCelestialBody) {
        this.orbitalSpeed = orbitalSpeed;
        this.radiusCelestialBody = radiusCelestialBody;
        this.angle = 0;
    }

    public void move() {
        angle += orbitalSpeed;
        updatePosition();
    }

    public abstract void updatePosition();

    public abstract void draw(Graphics2D g);

}
