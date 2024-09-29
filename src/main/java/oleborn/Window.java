package oleborn;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Arrays;

import static oleborn.utils.Utils.HEIGHT_WINDOW;
import static oleborn.utils.Utils.WIDTH_WINDOW;

public class Window extends JFrame {

    private BufferStrategy bufferStrategy;
    private PaintPanel panel;

    public Window() {
        super("Solar System Project");

        setIgnoreRepaint(true);
        setUndecorated(true);
        setBackground(Color.BLACK);
        setVisible(true);

        createBufferStrategy(4);
        bufferStrategy = getBufferStrategy();
        panel = new PaintPanel(bufferStrategy);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    public void update() {
        panel.update();
    }

    public void paint(Graphics2D g){
        panel.paint(g);
    }

    public void cleanUp(){
        BufferedImage image = new BufferedImage(WIDTH_WINDOW, HEIGHT_WINDOW, BufferedImage.TYPE_INT_ARGB);
        int[] imagePixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
        Arrays.fill(imagePixels, 0xff000000);
    }
}
