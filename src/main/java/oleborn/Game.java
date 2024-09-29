package oleborn;

import oleborn.utils.Utils;

import java.awt.*;

public class Game implements Runnable {

    Graphics2D graphics2D;
    Window window = new Window();

    public Game(){
        graphics2D = (Graphics2D) window.getGraphics();
        start();
    }

    private void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = Utils.AMOUNT_OF_TICKS;
        double ns = 1_000_000_000 / amountOfTicks;
        double delta = 0;
        while(true){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1){
                //место для всех активностей
                window.cleanUp();
                window.paint(graphics2D);
                window.update();
                delta--;
            }
        }
    }
}
