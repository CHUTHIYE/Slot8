public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }
    public abstract double getArea();

    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

class Rectangle extends Shape{
    public double length;
    public double width;

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

class Triangle extends Shape{
    public double base;
    public double height;

    @Override
    public double getArea() {
        return 05 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}

class TestShape{
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        System.out.println("Rectangle area " + rect.getArea());
        Shape tri = new Triangle();
        System.out.println("Triangle area " + tri.getArea());
    }
}
