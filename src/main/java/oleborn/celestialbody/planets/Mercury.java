package oleborn.celestialbody.planets;

import oleborn.abstractorbit.Planet;

import java.awt.*;

import static oleborn.utils.CelestialsUtils.MERCURY;

public class Mercury extends Planet {

    public Mercury() {
        super(MERCURY.getOrbitSpeed(),
                2,
                MERCURY.getOrbitMajorAxis(),
                MERCURY.getOrbitMinorAxis(),
                MERCURY.getOrbitEccentricity());
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(0x802301));
        g.fillOval((int) (x-radiusCelestialBody), (int) (y-radiusCelestialBody), 2*radiusCelestialBody, 2*radiusCelestialBody);
    }
}
