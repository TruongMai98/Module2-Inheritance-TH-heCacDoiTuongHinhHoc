public class Square extends Rectangle {
    private double side = 1.0;


    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }


    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public double setWidth(double side) {
        this.side = side;
        return side;
    }

    @Override
    public double setHeight(double side) {
        this.side = side;
        return side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    // set side voi cha la rectangle
    /*public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }*/
}
