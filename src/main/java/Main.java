public class Main {
    public static void main(String[] args) {
        LatLongConverter converter = new LatLongConverter();

        if(args.length < 2) {
            System.out.println("Usage: (latitude) (longitude)");
            return;
        }

        converter.setLongitude(args[1]);
        converter.setLatitude(args[0]);

        converter.convert();

        System.out.println("Longitude: " + converter.getLongitudeMiles() + " miles");
        System.out.println("Latitude: " + converter.getLatitudeMiles() + " miles");
    }
}
