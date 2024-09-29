package oleborn.celestialbody.sattelits;

import oleborn.abstractorbit.Satellites;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

public class Fobos extends Satellites {

    public Fobos() {
        super(CelestialsUtils.FOBOS.getOrbitMajorAxis(),
                CelestialsUtils.FOBOS.getOrbitSpeed(),
                1);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0xC0FFA6, false));
        g.fillOval((int) (x - radiusCelestialBody), (int) (y - radiusCelestialBody), 2* radiusCelestialBody, 2* radiusCelestialBody);
    }
}
