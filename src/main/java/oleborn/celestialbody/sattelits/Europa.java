package oleborn.celestialbody.sattelits;

import oleborn.abstractorbit.Satellites;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

public class Europa extends Satellites {
    public Europa() {
        super(CelestialsUtils.EUROPA.getOrbitMajorAxis(),
                CelestialsUtils.EUROPA.getOrbitSpeed(),
                1);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0xFD0000, false));
        g.fillOval((int) (x - radiusCelestialBody), (int) (y - radiusCelestialBody), 2* radiusCelestialBody, 2* radiusCelestialBody);
    }
}
