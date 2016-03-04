package com.ivon.focaldistance;

/**
 * Created by Owner on 3/3/2016.
 */
public class CameraUtils {

    public static double getObjectDistance(double f, double di) {
        return 1 / ((1/f) - (1/di));
    }

    public static double getObjectDistance(double di) {
        // This is calibrated for Nexus 6P camera only
        return 69.53310965 * Math.pow(di, -0.88427916);
    }
}
