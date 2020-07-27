public class LatLongConverter {

    private String longitude;
    private String latitude;
    private double longitudeDegrees;
    private double latitudeDegrees;
    private double longitudeMiles;
    private double latitudeMiles;

    public LatLongConverter() {
        longitudeDegrees = 0.0;
        latitudeDegrees = 0.0;
    }

    public void convert() {
        String degree;
        String minute;
        String second;
        int currIndex;
        int lastIndex;

        //**Convert latitude into decimal degrees.**
        currIndex = getIndex('*');
        degree = latitude.substring(0, currIndex);
        lastIndex = currIndex;

        currIndex = getIndex('.');
        minute = latitude.substring(lastIndex + 1, currIndex);
        lastIndex = currIndex;

        currIndex = getIndex('\'');
        second = latitude.substring(lastIndex, currIndex);

        System.out.println("Degrees: " + degree);
        System.out.println("Minutes: " + minute);
        System.out.println("Seconds: " + second);
        latitudeDegrees += Double.parseDouble(degree);
        latitudeDegrees += (Double.parseDouble(minute) / 60.0);
        latitudeDegrees += ((Double.parseDouble(second) * 60.0) / 3600.0);


        System.out.println("LatitudeDegrees: " + latitudeDegrees);
        double latitudeRadians = latitudeDegrees * (Math.PI / 180);
        System.out.println("LatitudeRadians: " + latitudeRadians);
        double cosineLatitude = Math.cos(latitudeRadians);
        System.out.println("CosineLatitude: " + cosineLatitude);
        longitudeMiles = cosineLatitude * 69.2;
        longitudeMiles = Math.round(longitudeMiles * 100.0) / 100.0;
        latitudeMiles = latitudeDegrees * 69;
        latitudeMiles = Math.round(latitudeMiles * 100.0) / 100.0;
    }

    private int getIndex(char token) {
        for(int i = 0; i < latitude.length(); i++) {
            if(latitude.charAt(i) == token) {
                return i;
            }
        }
        return 0;
    }

    public double getLongitude() {
        return longitudeDegrees;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitudeDegrees;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public double getLongitudeMiles() {
        return longitudeMiles;
    }

    public void setLongitudeMiles(double longitudeMiles) {
        this.longitudeMiles = longitudeMiles;
    }

    public double getLatitudeMiles() {
        return latitudeMiles;
    }

    public void setLatitudeMiles(double latitudeMiles) {
        this.latitudeMiles = latitudeMiles;
    }
}

