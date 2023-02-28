interface Shape {
    double getArea();
    double getPerimeter();
}

abstract class AbstractShape implements Shape {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Rectangle extends AbstractShape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Rectangle [width=" + getWidth() + ", height=" + getHeight() + ", color=" + getColor() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}

class Circle extends AbstractShape {
    private double radius;
    private static final double PI = 3.142;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Circle [radius=" + getRadius() + ", color=" + getColor() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }

    public static class Main {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle();
            rectangle1.setWidth(5);
            rectangle1.setHeight(3);
            rectangle1.setColor("Blue");
            System.out.println(rectangle1);

            Rectangle rectangle2 = new Rectangle();
            rectangle2.setWidth(7);
            rectangle2.setHeight(4);
            rectangle2.setColor("Red");
            System.out.println(rectangle2);

            Circle circle1 = new Circle();
            circle1.setRadius(2.5);
            circle1.setColor("Green");
            System.out.println(circle1);

            Circle circle2 = new Circle();
            circle2.setRadius(4);
            circle2.setColor("Yellow");
            System.out.println(circle2);
        }
    }
}


