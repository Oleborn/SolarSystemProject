package oleborn.celestialbody.sattelits;

import oleborn.abstractorbit.Satellites;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

public class Ganymede extends Satellites {
    public Ganymede() {
        super(CelestialsUtils.GANYMEDE.getOrbitMajorAxis(),
                CelestialsUtils.GANYMEDE.getOrbitSpeed(),
                1);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0x43CB00, false));
        g.fillOval((int) (x - radiusCelestialBody), (int) (y - radiusCelestialBody), 2* radiusCelestialBody, 2* radiusCelestialBody);
    }
}
