public class Rectangle {

    protected double height;
    protected double width;

    public Rectangle(double height,  double width){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2 * height + width;
    }

    public static class Main{
        public static void main (String [] rectangle){
            // setting rectangle properties

            Rectangle rectangle1 = new Rectangle(4.0, 8.0);
            Rectangle rectangle2 = new Rectangle(7.0, 2.0);

            // Displaying Rectangle details
            System.out.println("Rectangle A\n" +
                    "Height: "+rectangle1.height+ ", Width: "+rectangle1.width+"\n" +
                    "Area: "+rectangle1.getArea()+"sq units\n" +
                    "Perimeter: "+rectangle1.getPerimeter()+" units\n"
            );

            System.out.println("Rectangle B\n" +
                    "Height: "+rectangle2.height+ ", Width: "+rectangle2.width+"\n" +
                    "Area: "+rectangle2.getArea()+" sq units\n" +
                    "Perimeter: "+rectangle2.getPerimeter()+" units\n"
            );
        }
    }
}
