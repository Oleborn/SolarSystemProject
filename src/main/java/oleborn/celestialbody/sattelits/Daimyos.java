package oleborn.celestialbody.sattelits;

import oleborn.abstractorbit.Satellites;
import oleborn.utils.CelestialsUtils;

import java.awt.*;

public class Daimyos extends Satellites {

    public Daimyos() {
        super(CelestialsUtils.DAIMYOS.getOrbitMajorAxis(),
                CelestialsUtils.DAIMYOS.getOrbitSpeed(),
                1);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0xE3C945, false));
        g.fillOval((int) (x - radiusCelestialBody), (int) (y - radiusCelestialBody), 2* radiusCelestialBody, 2* radiusCelestialBody);
    }
}
