import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LatLongConverter converter = new LatLongConverter();
        CircumferenceGenerator generator = new CircumferenceGenerator(10.0);

        if(args.length < 2) {
            System.out.println("Usage: (latitude) (longitude)");
            return;
        }

        converter.setLongitude(args[1]);
        converter.setLatitude(args[0]);

        converter.convert();


        double longitudeMiles = converter.getLongitudeMiles();
        double latitudeMiles = converter.getLatitudeMiles();
        System.out.println("Longitude: " + longitudeMiles + " miles");
        System.out.println("Latitude: " + latitudeMiles + " miles");
        generator.calculateCircumference();

        PointCalculator pointCalculator = new PointCalculator(longitudeMiles, latitudeMiles, 10.0);

        List<Double> latitudePoints = new ArrayList<>();
        List<Double> longitudePoints = new ArrayList<>();

        latitudePoints = pointCalculator.calculateLatitudePoint();
        longitudePoints = pointCalculator.calculateLongitudePoint();

        //Make Lists sorted lists so that they can be easily matched up to which ever degree is which.

        for(int i = 0; i < 10; i++) {
            System.out.println(latitudePoints.get(i));
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(longitudePoints.get(i));
        }
    }
}
