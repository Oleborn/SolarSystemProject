package oleborn.celestialbody.planets;

import oleborn.abstractorbit.Orbits;
import oleborn.utils.CelestialType;
import oleborn.utils.CelestialsUtils;
import oleborn.utils.Utils;

import java.awt.*;

public class Sun {

    Orbits orbit = new Orbits();

    public void draw(Graphics2D g) {
        g.setColor(Color.YELLOW);
        g.fillOval( Utils.CENTER_WINDOW_X-8, Utils.CENTER_WINDOW_Y-8, 16, 16);

        for(CelestialsUtils planet: CelestialsUtils.values()) {
            if(planet.getCelestialType() == CelestialType.PLANET){
                orbit.drawOrbitPlanet(g, planet.getOrbitMajorAxis(), planet.getOrbitMinorAxis(), planet.getOrbitEccentricity());
            }
        }
    }
}
