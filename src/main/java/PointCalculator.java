import java.util.ArrayList;
import java.util.List;

public class PointCalculator {

    private double latitudeOrigin;
    private double longitudeOrigin;
    private double radius;
    //Angle is calculated to be every 1 degree.
    private double angle;
    private final int DEGREE = 360;

    public PointCalculator(double latitudeOrigin, double longitudeOrigin, double radius) {
        this.latitudeOrigin = latitudeOrigin;
        this.longitudeOrigin = longitudeOrigin;
        this.radius = radius;
    }

    public List<Double> calculateLatitudePoint() {
        List<Double> latitudePointList = new ArrayList<>();
        double currPoint;
        for(int i = 0; i < DEGREE - 1; i++) {
            currPoint = latitudeOrigin + (radius * Math.cos(i));
            currPoint = Math.round(currPoint * 100.0) / 100.0;
            latitudePointList.add(currPoint);
        }
        return latitudePointList;
    }

    public List<Double> calculateLongitudePoint() {
        List<Double> longitudePointList = new ArrayList<>();
        double currPoint;
        for(int i = 0; i < DEGREE - 1; i++) {
            currPoint = longitudeOrigin + (radius * Math.sin(i));
            currPoint = Math.round(currPoint * 100.0) / 100.0;
            longitudePointList.add(currPoint);
        }
        return longitudePointList;
    }

    public double getLatitudeOrigin() {
        return latitudeOrigin;
    }

    public void setLatitudeOrigin(double latitudeOrigin) {
        this.latitudeOrigin = latitudeOrigin;
    }

    public double getLongitudeOrigin() {
        return longitudeOrigin;
    }

    public void setLongitudeOrigin(double longitudeOrigin) {
        this.longitudeOrigin = longitudeOrigin;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
