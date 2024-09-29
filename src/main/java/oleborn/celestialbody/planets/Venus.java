package oleborn.celestialbody.planets;

import oleborn.abstractorbit.Planet;

import java.awt.*;

import static oleborn.utils.CelestialsUtils.MERCURY;
import static oleborn.utils.CelestialsUtils.VENUS;

public class Venus extends Planet {
    public Venus() {
        super(VENUS.getOrbitSpeed(),
                3,
                VENUS.getOrbitMajorAxis(),
                VENUS.getOrbitMinorAxis(),
                VENUS.getOrbitEccentricity());
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(0x4A6B14));
        g.fillOval((int) (x-radiusCelestialBody), (int) (y-radiusCelestialBody), 2*radiusCelestialBody, 2*radiusCelestialBody);
    }
}
