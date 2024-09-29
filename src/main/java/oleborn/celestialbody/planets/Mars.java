package oleborn.celestialbody.planets;

import oleborn.abstractorbit.Planet;
import oleborn.celestialbody.sattelits.Daimyos;
import oleborn.celestialbody.sattelits.Fobos;
import oleborn.utils.CelestialsUtils;

import java.awt.*;


import static oleborn.utils.CelestialsUtils.MARS;

public class Mars extends Planet {

    Fobos fobos = new Fobos();
    Daimyos daimyos = new Daimyos();

    public Mars() {
        super(MARS.getOrbitSpeed(),
                3,
                MARS.getOrbitMajorAxis(),
                MARS.getOrbitMinorAxis(),
                MARS.getOrbitEccentricity());
    }

    @Override
    public void move() {
        super.move();
        fobos.move(x, y);
        daimyos.move(x, y);
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(0xFF5B26));
        g.fillOval((int) (x-radiusCelestialBody), (int) (y-radiusCelestialBody), 2*radiusCelestialBody, 2*radiusCelestialBody);

        fobos.draw(g);
        daimyos.draw(g);

        fobos.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.FOBOS.getOrbitMajorAxis(), CelestialsUtils.FOBOS.getOrbitMinorAxis());
        daimyos.drawOrbitSatellites(g, (int) x, (int) y, CelestialsUtils.DAIMYOS.getOrbitMajorAxis(), CelestialsUtils.DAIMYOS.getOrbitMinorAxis());

    }
}
