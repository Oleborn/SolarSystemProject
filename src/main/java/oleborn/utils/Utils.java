package oleborn.utils;


import java.util.Arrays;
import java.util.List;

public class Utils {
    public static final double AMOUNT_OF_TICKS = 120;
    public static final int WIDTH_WINDOW = 2000;
    public static final int HEIGHT_WINDOW = 1000;

    public static final int CENTER_WINDOW_X = WIDTH_WINDOW / 2;
    public static final int CENTER_WINDOW_Y = HEIGHT_WINDOW / 2;

    public static final double DEFAULT_SIZE = 150;


    public static List<Integer> calculationCenterOrbitForSun(int majorAxis, double eccentricity) {
        return Arrays.asList((int) (CENTER_WINDOW_X+(majorAxis*eccentricity)), CENTER_WINDOW_Y);
    }

}
