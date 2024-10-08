package in.balamt.practice.designprinciple.solid.ocp;

public class Triangle extends Shape{
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
