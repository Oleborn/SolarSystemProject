package oleborn.celestialbody.planets;

import oleborn.abstractorbit.Planet;
import oleborn.celestialbody.sattelits.Callisto;
import oleborn.celestialbody.sattelits.Europa;
import oleborn.celestialbody.sattelits.Ganymede;
import oleborn.celestialbody.sattelits.Io;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

import static oleborn.utils.CelestialsUtils.JUPITER;

public class Jupiter extends Planet {

    Io io = new Io();
    Europa europa = new Europa();
    Callisto callisto = new Callisto();
    Ganymede ganymede = new Ganymede();


    public Jupiter() {
        super(JUPITER.getOrbitSpeed(),
                6,
                JUPITER.getOrbitMajorAxis(),
                JUPITER.getOrbitMinorAxis(),
                JUPITER.getOrbitEccentricity());
    }

    @Override
    public void move() {
        super.move();
        io.move(x, y);
        europa.move(x, y);
        callisto.move(x, y);
        ganymede.move(x, y);
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(0x6B3B19));
        g.fillOval((int) (x-radiusCelestialBody), (int) (y-radiusCelestialBody), 2*radiusCelestialBody, 2*radiusCelestialBody);

        io.draw(g);
        europa.draw(g);
        callisto.draw(g);
        ganymede.draw(g);

        io.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.IO.getOrbitMajorAxis(), CelestialsUtils.IO.getOrbitMinorAxis());
        europa.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.EUROPA.getOrbitMajorAxis(), CelestialsUtils.EUROPA.getOrbitMinorAxis());
        callisto.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.CALLISTO.getOrbitMajorAxis(), CelestialsUtils.CALLISTO.getOrbitMinorAxis());
        ganymede.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.GANYMEDE.getOrbitMajorAxis(), CelestialsUtils.GANYMEDE.getOrbitMinorAxis());

    }
}
