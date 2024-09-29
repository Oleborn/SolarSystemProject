package oleborn;

import oleborn.celestialbody.planets.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

import static oleborn.utils.Utils.HEIGHT_WINDOW;
import static oleborn.utils.Utils.WIDTH_WINDOW;

public class PaintPanel extends JPanel {

    Sun sun = new Sun();
    Mercury mercury = new Mercury();
    Venus venus = new Venus();
    Earth earth = new Earth();
    Mars mars = new Mars();
    Jupiter jupiter = new Jupiter();


    private Image image;
    private Graphics2D graphics;
    private BufferStrategy bs;

    public PaintPanel(BufferStrategy bs) {
        this.bs = bs;
        setPreferredSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW));
        setFocusable(true);
        requestFocusInWindow();
    }

    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphics = (Graphics2D) image.getGraphics();

        draw(graphics);
        g.drawImage(image, 0, 0, null);
    }
    public void draw(Graphics2D g) {
        sun.draw(g);
        mercury.draw(g);
        venus.draw(g);
        earth.draw(g);
        mars.draw(g);
        jupiter.draw(g);
    }

    public void update(){
        mercury.move();
        venus.move();
        earth.move();
        mars.move();
        jupiter.move();
    }
}
