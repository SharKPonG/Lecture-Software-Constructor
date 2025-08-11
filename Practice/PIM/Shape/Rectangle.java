package Practice.PIM.Shape;

public class Rectangle implements Shape {
    protected double width;
    protected double height;
    protected double area;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    // method
    @Override
    public double calculateArea() {
        if (width <= 0 || height <= 0) {
            System.out.println("Invalid dimensions");
            return -1;
        } else {
            area = width * height;
            return area; // 20
        }
    }
    
    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 32.0);
        double result = rectangle.calculateArea();
        if (result != -1) {
            System.out.println("Area: " + result);
        } else {
            System.out.println("Error: Invalid dimensions, cannot calculate area.");
        }
    }
}
