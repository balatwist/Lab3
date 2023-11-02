package prob3;

 class Circle extends Cylinder{
     private double radius;

     public Circle(double height, double radius) {
         super(height, radius);

     }

     public double getRadius() {
         return radius;
     }
     public  double computeArea(){
         return Math.PI * radius * radius;

     }
 }
