package prob3;

public class Cylinder {
    private double height;
    double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume(){

        return Math.PI*(radius*radius)*height;

    }
}
