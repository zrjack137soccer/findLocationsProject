public class CircumferenceGenerator {

    private double radius;
    private final double PI = 3.14;
    private double circumference;

    public CircumferenceGenerator(double radius) {
        this.radius = radius;
    }

    public void calculateCircumference() {
        circumference = (2 * PI) * radius;
        circumference = Math.round(circumference * 100.0) / 100.0;
        System.out.println("Circumference Calculated: " + circumference);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
