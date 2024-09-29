package oleborn.celestialbody.sattelits;

import oleborn.abstractorbit.Satellites;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

public class Io extends Satellites {
    public Io() {
        super(CelestialsUtils.IO.getOrbitMajorAxis(),
                CelestialsUtils.IO.getOrbitSpeed(),
                1);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0x0042DE, false));
        g.fillOval((int) (x - radiusCelestialBody), (int) (y - radiusCelestialBody), 2* radiusCelestialBody, 2* radiusCelestialBody);
    }
}
