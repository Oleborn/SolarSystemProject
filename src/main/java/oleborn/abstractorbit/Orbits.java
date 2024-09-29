package oleborn.abstractorbit;

import oleborn.utils.Utils;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.List;

public class Orbits {

    public void drawOrbitPlanet(Graphics2D g, int majorAxis, int minorAxis, double eccentricity) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.white);
        g.setStroke(new BasicStroke(1/2));
        List<Integer> coord = Utils.calculationCenterOrbitForSun(majorAxis, eccentricity);
        g.draw(new Ellipse2D.Double(coord.get(0)-majorAxis, coord.get(1)-minorAxis, majorAxis*2, minorAxis*2));
    }

    public void drawOrbitSatellites(Graphics2D g, int coordPlanetX, int coordPlanetY, int majorAxis, int minorAxis) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.white);
        g.setStroke(new BasicStroke(1/2));
        g.draw(new Ellipse2D.Double(coordPlanetX-majorAxis, coordPlanetY-minorAxis, majorAxis*2, minorAxis*2));
    }

}
