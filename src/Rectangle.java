public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public String toString() {
        return "A Rectangle with width = " +
                width +
                " and height " +
                height +
                ",  which is a subclass of " +
                super.toString();
    }
}
