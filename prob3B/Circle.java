package prob3B;

public class Circle {
    private Cylinder baseCylinder;

    public Circle(Cylinder baseCylinder) {
        this.baseCylinder = baseCylinder;
    }

    public double computeArea() {
        double radius = baseCylinder.getRadius();
        return Math.PI * radius * radius;
    }
}
