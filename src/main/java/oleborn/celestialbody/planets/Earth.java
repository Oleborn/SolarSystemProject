package oleborn.celestialbody.planets;

import oleborn.abstractorbit.Planet;
import oleborn.celestialbody.sattelits.Moon;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

import static oleborn.utils.CelestialsUtils.EARTH;


public class Earth extends Planet {

    Moon moon = new Moon();

    public Earth() {
        super(EARTH.getOrbitSpeed(),
                3,
                EARTH.getOrbitMajorAxis(),
                EARTH.getOrbitMinorAxis(),
                EARTH.getOrbitEccentricity());
    }

    @Override
    public void move() {
        super.move();
        moon.move(x, y);
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(0x08BDFF));
        g.fillOval((int) (x-radiusCelestialBody), (int) (y-radiusCelestialBody), 2*radiusCelestialBody, 2*radiusCelestialBody);

        moon.draw(g);
        moon.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.MOON.getOrbitMajorAxis(), CelestialsUtils.MOON.getOrbitMinorAxis());
    }
}
