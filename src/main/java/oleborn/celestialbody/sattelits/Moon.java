package oleborn.celestialbody.sattelits;


import oleborn.abstractorbit.Satellites;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

public class Moon extends Satellites {

    public Moon() {
        super(CelestialsUtils.MOON.getOrbitMajorAxis(),
                CelestialsUtils.MOON.getOrbitSpeed(),
                1);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0x868686, false));
        g.fillOval((int) (x - radiusCelestialBody), (int) (y - radiusCelestialBody), 2* radiusCelestialBody, 2* radiusCelestialBody);
    }
}
