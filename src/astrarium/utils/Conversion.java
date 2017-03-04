package astrarium.utils;

/**
 * A utility class to convert units.
 * Created by on 17/02/2017.
 *
 * @author Vittorio
 */
abstract public class Conversion {
    public static double degToRad(double d) {
        return Math.toRadians(d);
    }

    public static double radToDeg(double d) {
        return Math.toDegrees(d);
    }
}
